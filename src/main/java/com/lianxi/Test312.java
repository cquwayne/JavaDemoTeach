package com.lianxi;

import java.util.Scanner;

public class Test312 {
    public static void main(String[] args){
        int result;
        Scanner in=new Scanner(System.in);
        System.out.println("please input m");
        int m =in.nextInt();
        System.out.println("please input n");
        int n =in.nextInt();
        if (m > 0 && n >0){
            result = Math.max(m, n);
            while (result % m != 0 || result % n != 0){
                result ++;
            }
            System.out.println("最小公倍数" + result);
        }
        else {
            System.out.println("输入的数字不是正整数");
        }
    }
}
