package com.jianzhi;

public class Solution32 {
    public String PrintMinNumber(int [] numbers){
        if (numbers.length == 0){
            return ""; }
        else {

        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length; j++) {
                int m = Integer.valueOf(numbers[i]+""+numbers[j]);
                int n = Integer.valueOf(numbers[j]+""+numbers[i]);
                if (n>m){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        String str = "";
        for (int k = 0; k < numbers.length; k++) {
            str = str + numbers[k];
        }
        return str;
    }
}
