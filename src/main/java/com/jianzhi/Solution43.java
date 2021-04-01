package com.jianzhi;

public class Solution43 {
    public String LeftRotateString(String str,int n) {
        if (str == null || n > str.length()){
            return str;
        }
        String str1 = str.substring(n)+str.substring(0,n);
        return str1;
    }
}
