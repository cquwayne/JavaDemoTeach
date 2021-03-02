package com.lianxi;

public class Test316 {
    public static void main(String[] args){
        int[] a = {2, -8, 5, 30};
        System.out.println("数组a的地址为:" + a);
        System.out.println("数组a的长度为:" + a.length);
        print(a);
        int[] b;
        b = a;
        System.out.println("数组b的地址是:" + a);
        print(b);
        b[2] = 100;
        print(a);
        print(b);
    }
    static void print(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
