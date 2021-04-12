package com.jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution29 {
    public ArrayList<Integer> GetLeastNumbersSolution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length < k){
            return null;
        }
        Arrays.sort(input);
        int i = 0;
        while (k>0){
            arrayList.add(input[i]);
            i++;
            k--;
        }
        return arrayList;
    }
}
