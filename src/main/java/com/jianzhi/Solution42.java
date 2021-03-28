package com.jianzhi;

import java.util.ArrayList;

public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]+array[j]==sum){
                    res.add(array[i]);
                    res.add(array[j]);
                    return res;
                }
            }
        }
        return null;
    }
}
