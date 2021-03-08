package com.jianzhi;

public class Solution47 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean i = (n>0)&&((sum += Sum_Solution(n-1))>0);
        return sum;
    }
}
