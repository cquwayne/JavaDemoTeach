package com.lianxi;

public class Test309 {
    public static void main(String[] args){
        int a = 48;
        if (a >= 0) {
            System.out.println(fun1(a));
        }
        else {
            System.out.
                    println(fun2(a));
        }
    }
    static double fun1(int x) {
        return Math.sqrt(x)+1;
    }
    static double fun2(int x){
        return x*x;
    }
}
