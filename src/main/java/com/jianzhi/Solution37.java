package com.jianzhi;

public class Solution37 {
    public int GetNumberOfK(int [] array , int k) {
        int num = 0;

        for (int i=0; i<array.length; i++){
            if (array[i]==k){
                num -=i;
                break;
            }
        }
        for (int j=array.length; j>0; j--){
            if (array[j]==k){
                num -=j-1;
                break;
            }
        }
        return num;
    }
}
