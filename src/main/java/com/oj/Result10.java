package com.oj;

import java.util.Arrays;
import java.util.Scanner;

public class Result10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String[] str = in.nextLine().split(",");
            Arrays.sort(str);
            for (int i = 0; i < str.length-1; i++) {
                System.out.print(str[i]+",");
            }
            System.out.println(str[str.length-1]);
        }
    }
}