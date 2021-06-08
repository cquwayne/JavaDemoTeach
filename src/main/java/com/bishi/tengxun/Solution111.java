package com.bishi.tengxun;


import com.example.javalearn.jianzhi.ListNode;

public class Solution111 {
    public ListNode solve (ListNode S) {

        // write code here
        if (S == null || S.next == null){
            return S;
        }
        ListNode leng = S;
        int x = 0;
        while (leng.next != null){
            x++;
            leng = leng.next;
        }
        for (int i = 0; i < x; i++) {
            ListNode temp = S;
            leng.next = S;
            for (int j = 0; j < i; j++) {
                temp = temp.next;
                leng = leng.next;
            }
            leng.next = null;
            int y = 0;
            int p = temp.val;
            ListNode listNode = temp;
            for (int k = 0; k < x; k++) {
                listNode = listNode.next;
                if (p > listNode.val){
                    y++;
                }
            }
            if (y==x){
                return temp;
            }
        }
        return S;
    }
}
