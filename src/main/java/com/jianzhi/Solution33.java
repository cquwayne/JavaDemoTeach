package com.jianzhi;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution33 {
    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0){
            return 0;
        }
        //创建一个数组存放丑数
        ArrayList<Integer> arrayList = new ArrayList<>();

        //将第一个丑数放入数组
        arrayList.add(0,1);

        //创建三个指针
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        //在数组中从小到大放入index个丑数
        for (int i = 1; i < index; i++) {
            arrayList.add(i,min(arrayList.get(p2) *2, arrayList.get(p3) *3, arrayList.get(p5) *5));
            if (arrayList.get(p2)*2<=arrayList.get(i)){
                p2++;
            }
            if (arrayList.get(p3)*3<=arrayList.get(i)){
                p3++;
            }
            if (arrayList.get(p5)*5<=arrayList.get(i)){
                p5++;
            }
        }
        return arrayList.get(index-1);
    }

    public static int min(int a, int b, int c) {
        int min = Math.min(a, b);
        return Math.min(min, c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(GetUglyNumber_Solution(x));
    }
}
