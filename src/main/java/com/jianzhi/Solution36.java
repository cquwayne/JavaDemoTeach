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
        ListNode one = pHead1;
        ListNode two = pHead2;
        while (one != null) {
            while (two != null) {
                if (one == two) {
                    return one;
                }
                two = two.next;
            }
            one = one.next;
        }
        return null;
    }
}
