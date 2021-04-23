package com.oj;

import java.util.Scanner;

public class Result5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t <= 0) {
            return;
        }
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int m = in.nextInt();
                sum += m;
            }
            System.out.println(sum);
        }
    }
}
