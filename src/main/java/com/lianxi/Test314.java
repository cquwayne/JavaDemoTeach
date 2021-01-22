package com.lianxi;

//for循环

import java.util.Scanner;

public class Test314 {
    public static void main(String[] args){
        int i, j, k;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字");
        i = in.nextInt();
        j = (int) Math.sqrt(i);
        for (k = 2; k <= j; k++){
            if (i % k == 0){
                break;
            }
        }
        if (k == j+1){
            System.out.println(i + "是一个素数");
        }
        else{
            System.out.println(i + "是一个合数");
        }
    }
}
