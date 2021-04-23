package com.oj;

import java.util.Scanner;

public class Result4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int sum = 0;
            if (n == 0){
                return;
            }
            for (int i = 0; i < n; i++) {
                int m = in.nextInt();
                sum += m;
            }
            System.out.println(sum);
        }
    }
}
