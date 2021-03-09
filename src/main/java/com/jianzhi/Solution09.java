package com.jianzhi;

//变态跳台阶

public class Solution09 {
    public int jumpFloorII(int target) {
        if (target == 0){
            return 0;
        }else if (target == 1){
            return 1;
        }else {
            return 2*jumpFloorII(target-1);
        }
    }
}
