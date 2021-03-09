package com.jianzhi;

import java.util.ArrayList;

 class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        while (listNode!=null){
        arrayList.add(0,listNode.val);
        listNode = listNode.next;
        }
        return arrayList;
    }
 }
