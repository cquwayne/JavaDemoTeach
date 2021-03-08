package com.jianzhi;

public class Solution48 {
    public int Add(int num1, int num2) {
        if (num1<0){
            for (int j=0; j>num1; j--){
                num2--;
            }
        }else {
            for(int i=0; i<num1; i++){
                num2++;
            }
        }
        return num2;
    }
}
