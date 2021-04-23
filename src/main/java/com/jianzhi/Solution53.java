package com.jianzhi;

import java.util.regex.Pattern;

//        ^表示开头 $ 表示结尾  java中两个\\ 代表一个\
//        * 零次或多次匹配前面的字符或子表达式
//        ？零次或一次匹配前面的字符或子表达式
//        + 一次或多次匹配前面的字符或子表达式
//        [] 字符集。匹配包含的任一字符
//        (:? )匹配 pattern 但不捕获该匹配的子表达式，即它是一个非捕获匹配

public class Solution53 {
    public boolean isNumeric (String str) {
        if (str.length()==0 || str==null || str.equals("+") || str.equals("-")){
            return false;
        }
        String s = "^[+-]?((\\d+)|(\\.\\d+))((\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        return Pattern.matches(s,str);
    }
}
