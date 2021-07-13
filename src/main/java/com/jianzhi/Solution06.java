package com.jianzhi;

public class Solution06 {
    public int minNumberInRotateArray(int [] array) {
        int m = 0;
        int flag = array[0];
        for (int i=0; i<array.length; i++){
            if (array[0]<=array[i]){
                m++;
            }else{
                break;
            }
        }
        if (m == array.length){
            return flag;
        }else{
            return array[m];
        }
    }
}
