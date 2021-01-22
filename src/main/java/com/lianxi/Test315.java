package com.lianxi;

import java.util.Scanner;

public class Test315 {
    public static void main(String[] args){
        System.out.println("请输入一个大于2的正整数");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i , k;
        boolean yes;
        for (k = 2; k < num; k++){
            yes = true;
            i = 2;
            while (i <= Math.sqrt(k) && yes){
                if (k%i == 0){
                    yes = false;
                }
                i++;
            }
            if (yes){
                System.out.print(k + " ");
            }
        }
    }
}
