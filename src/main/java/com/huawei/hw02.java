package com.huawei;

import java.util.Scanner;

/**
 * Created by waynehe on 2021/7/14 12:06 上午
 */
//写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
//然后输出输入字符串中该字母的出现次数。不区分大小写，字符串长度小于500。
//     输入描述：
//        第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
//
//     输出描述：
//        输出输入字符串中含有该字符的个数。

public class hw02 {
    static int num = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch= in.nextLine().charAt(0);
        if (str.length() == 0){
            System.out.println(0);
        }
        System.out.println(counter(str,ch));
    }
    static int counter(String str, char ch){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch || (int) str.charAt(i) == (int) ch + 32 || (int) str.charAt(i) == (int) ch - 32){
                num++;
            }
        }
        return num;
    }
}
