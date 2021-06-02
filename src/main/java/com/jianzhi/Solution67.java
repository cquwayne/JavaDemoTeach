package com.jianzhi;

import java.util.Scanner;

public class Solution67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println(m);
    }
    public int cutRope(int target) {
        int[] dp = new int[target + 1];

        //绳子长度从2 ~ n
        for(int i = 2;i <= target;i++){
            for(int j = 1;j <= i - 1;j++){
                //第一刀可以剪在1 ~ i - 1处
                dp[i] = Math.max(dp[i],Math.max(j * (i - j),j * dp[i - j]));
            }
        }
        return dp[target];
    }
}
