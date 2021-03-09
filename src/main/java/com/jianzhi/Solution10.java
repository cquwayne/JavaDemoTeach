package com.jianzhi;

public class Solution10 {
    public static int rectCover(int target) {
        int a=1;
        int b=1;
        for (int i=1; i<target; i++){
            a = a+b;
            b = a-b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个整数：" + rectCover(5));
    }
}
