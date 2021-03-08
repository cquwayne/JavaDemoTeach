package com.jianzhi;

public class Solution51 {
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int m = 0; m<A.length; m++){
            B[m]= 1;
        }
        for (int i = 0; i<A.length; i++){
            for (int j = 0; j<A.length; j++){
                if (j==i){
                    continue;
                }else {
                    B[i] *= A[j];
                }
            }
        }
        return B;
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.println(multiply(n));
    }
}
