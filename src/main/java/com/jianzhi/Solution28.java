package com.jianzhi;

import java.util.Arrays;

public class Solution28 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int i = 0;
        Arrays.sort(array);
        int mid = array[array.length/2];
        for (int num : array){
            if (num == mid){
                i++;
            }
        }
        return i<=array.length/2 ? 0 : mid;
    }

    public static void main(String[] args) {
        int[] b = new int[]{1, 2, 3, 3, 3, 3, 5, 4, 3};
        System.out.println(MoreThanHalfNum_Solution(b));
    }
}
