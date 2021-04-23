package com.oj;

//输入描述第一行是一个正整数n，表示二维数组有n行n列。

import java.util.Scanner;

public class Result21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] array = new int[n][n];
        System.out.println("输入数组的各个元素：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
}
