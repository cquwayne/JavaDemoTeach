package com.jianzhi;

public class Solution50 {
    public int duplicate (int[] numbers) {
        int m = -1;
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                if (numbers[i]==numbers[j] && i!=j){
                    m = numbers[i];
                    return m;
                }else {
                    continue;
                }
            }
        }
        return m;
    }
}
