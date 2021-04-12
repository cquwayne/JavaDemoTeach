package com.jianzhi;

public class Solution35 {
    public int InversePairs(int [] array) {
        int num = 0;
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (i == j){
                    continue;
                }else if (array[i]>array[j]){
                    num++;
                }
            }
        }
        return num % 1000000007;
    }
}
