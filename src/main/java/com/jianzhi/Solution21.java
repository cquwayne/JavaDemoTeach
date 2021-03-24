package com.jianzhi;

import java.util.Stack;

public class Solution21 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int n=0, j=0;
        Stack<Integer> res = new Stack<Integer>();
        for (int m=0; m<pushA.length; m++){
            if (pushA[m]!=popA[n]){
                res.push(pushA[m]);
            }else {
                n++;
                while (!res.isEmpty() && res.peek()==popA[n]){
                    res.pop();
                    n++;
                }
            }
        }
        if(n< popA.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] A= {1,2,3,4,5};
        int [] B= {3,5,4,1,2};
        System.out.println(IsPopOrder(A,B));
    }
}
