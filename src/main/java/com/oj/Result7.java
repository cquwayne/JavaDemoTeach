package com.oj;

import java.util.Scanner;

public class Result7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int sum = 0;
            String [] str = in.nextLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                sum += Integer.parseInt(str[i]);
            }
            System.out.println(sum);
        }
    }
}
