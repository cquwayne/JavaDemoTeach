package com.jianzhi;

public class Solution11 {
    public int NumberOf1(int n) {
        int i = 0;
        int j = 1, flag = 0;
        while (flag <= 32){
            if ((n&i) != 0){
                i <<=1;
                j++;
            }
            flag ++;
        }
        return j;
    }
}
