package com.jianzhi;

import java.util.*;


public class Solution02 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace (String s) {
        String res = "";
        for(int i=0; i<s.length(); i++){
            char j = s.charAt(i);
            if (j == ' '){
                res += "%20";
            }
            else {
                res += s.charAt(i);
            }
        }
        return res;
    }
}