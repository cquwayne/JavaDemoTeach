package com.jianzhi;

import java.util.Arrays;

public class Solution45 {
    public static boolean IsContinuous(int [] numbers) {
        Arrays.sort(numbers);
        if (numbers.length == 0){
            return false;
        }
        int i = 0;
        int res = 0;
        while (numbers[i]==0){
            i ++;
        }
        for (int j=i; j<numbers.length-1; j++){
            if (res<=i && res>=0){
                res += numbers[j+1]-numbers[j]-1;
                if (res>i || res<0){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] num = {};
        System.out.println(IsContinuous(num));
    }
}
