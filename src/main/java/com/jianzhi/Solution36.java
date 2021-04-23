package com.jianzhi;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        if (cur1 == null || cur2 == null){
            return null;
        }
        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
            if (cur1 != cur2){
                if (cur1 == null){
                    cur1 = pHead2;
                }
                if (cur2 == null){
                    cur2 = pHead1;
                }
            }
        }
        return cur1==cur2 ? cur1 : null;
    }
}
