package com.bishi;


import java.util.Scanner;
import java.util.Stack;

public class ReorderStr {

    public static void main(String[] args) {
        ReorderStr reorderStr = new ReorderStr();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String str = "(u(love)i)";
        reorderStr.trans(str);
    }
    public void trans(String args) {

        Stack<Integer> stack = new Stack<>();
        int size = args.length();
        for (int i=0; i<size; i++){
            if (args.charAt(i) == '('){
                stack.push(i);
            }else if (args.charAt(i)==')' && i!=args.length()-1){
                int m = stack.pop();
                args = tran(args,m,i);
                i=0;
                size =args.length();
            }else if (i == args.length()-1){
                String ss =args.substring(1,i);
                StringBuffer sb = new StringBuffer(ss);
                System.out.println(sb.reverse());
            }
        }
    }
    public String tran (String str ,int m, int n){
        String temp = str.substring(m+1,n);
        StringBuffer sb = new StringBuffer(temp);
        return str.substring(0,m)+sb.reverse()+str.substring(n+1);
    }
}
