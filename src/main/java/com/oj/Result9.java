package com.oj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Result9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String [] str = in.nextLine().split(" ");
            Arrays.sort(str);
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]+' ');
            }
            System.out.println();
        }
    }
}
