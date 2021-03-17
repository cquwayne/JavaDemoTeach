package com.jianzhi;

public class Solution11 {
    public int NumberOf1(int n) {
        int i = 1;
        int j = 0, flag = 0;
        while (flag <= 32){
            if ((n&i) != 0){
                j++;
            }
            i <<=1;
            flag ++;
        }
        return j;
    }
}
