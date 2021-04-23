package com.oj;

//输入第一行包括一个数据组数t(1 <= t <= 100)
//接下来每行包括两个正整数a,b(1 <= a, b <= 10^9)

import java.util.Scanner;

public class Result2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
