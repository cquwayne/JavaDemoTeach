package com.jianzhi;

import java.util.ArrayList;
import java.util.Stack;

public class Solution15 {
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty()){
            return null;}
        ListNode node = stack.pop();
        ListNode dummy = node;
        while (!stack.empty()){
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        node.next = null;
        return dummy;
    }
}
