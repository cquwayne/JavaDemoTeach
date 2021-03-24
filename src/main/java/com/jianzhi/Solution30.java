package com.jianzhi;

public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for (int i=1; i<array.length; i++){
            array[i] += array[i-1] < 0 ? array[i-1] : array[i];
            max = Math.max(max,array[i]);
        }
        return max;
    }
}
