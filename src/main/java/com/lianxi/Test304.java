package com.lianxi;

public class Test304 {
    static int numbers = 3;
    public static void main(String[] args){
        int numbers = 4;
        System.out.println("局部变量numbers的值为" + numbers);
        System.out.println("全局变量numbers的值为" + Test304.numbers);
    }
}
