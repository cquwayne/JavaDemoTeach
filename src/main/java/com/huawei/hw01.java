package com.huawei;

import java.util.Scanner;

/**
 * Created by waynehe on 2021/7/13 11:57 下午
*/
//计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
//   输入描述：
//      输入一行，代表要计算的字符串，非空，长度小于5000。
//
//   输出描述：
//      输出一个整数，表示输入字符串最后一个单词的长度。

public class hw01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strings = in.nextLine().split(" ");
        System.out.println(counter(strings));
    }
    static int counter (String[] strings){
        return strings[strings.length - 1].length();
    }
}
