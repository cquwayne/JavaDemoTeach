package com.jianzhi;

import java.util.ArrayList;

public class Solution41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i=1; i<(sum/2)+1; i++){
            int res = 0;
            int j = i;
            while (res < sum){
                res += j;
                j++;
            }
            if (res == sum){
                ArrayList<Integer>result1 = new ArrayList<>();
                for (int n=i;n<j;n++){
                    result1.add(n);
                }
                result.add(result1);
            }
        }
        return result;
    }
}
