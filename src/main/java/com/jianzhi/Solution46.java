package com.jianzhi;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution46 {
    public static int LastRemaining_Solution(int n, int m) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (n==0){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        int flag = 0;
        while (arrayList.size()>1){
            flag = (m+flag-1)%arrayList.size();
            arrayList.remove(flag);
        }
        return arrayList.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(LastRemaining_Solution(x,y));
    }
}
