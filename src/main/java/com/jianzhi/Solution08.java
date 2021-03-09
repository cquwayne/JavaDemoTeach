package com.jianzhi;

public class Solution08 {
    public int jumpFloor(int target) {
        int i = 0;
        if (target ==1){
            i = 1;
        }else if (target == 2){
            i = 2;
        }else {
            i = jumpFloor(target-1)+jumpFloor(target-2);
        }
        return i;
    }
}
