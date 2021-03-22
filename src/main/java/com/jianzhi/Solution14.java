package com.jianzhi;

import java.util.Stack;

public class Solution14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode tmp = pHead;
        Stack<ListNode>flag = new Stack<ListNode>();
        int i = 0;
        if(tmp == null){
            return tmp;
        }
        while (tmp != null){
            flag.push(tmp);
            tmp = tmp.next;
            i ++;
        }
        while (k>0&&k<i){
            tmp = flag.pop();
            k--;
        }
        return tmp;
    }
}



