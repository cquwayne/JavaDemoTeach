package com.jianzhi;

public class Solution07 {
    public static int Fibonacci(int n) {
        if (n == 1){
            return 1;
        }else if(n == 0){
            return 0;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("斐波那契数列的第七项是" + Fibonacci(7));
    }
}

