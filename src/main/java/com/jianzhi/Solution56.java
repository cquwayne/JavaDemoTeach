package com.jianzhi;

import java.util.HashSet;
import java.util.Set;

public class Solution56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next==null){
            return pHead;
        }
        ListNode pre = pHead;
        ListNode aft = pHead.next;
        Set<Integer> set = new HashSet<>();
        while (aft != null){
            if (pre.val == aft.val){
                set.add(pre.val);
            }
            pre = aft;
            aft = aft.next;
        }
        while (pHead != null && set.contains(pHead.val)){
            pHead = pHead.next;
        }
        if (pHead == null){
            return null;
        }
        pre = pHead;
        aft = pHead.next;
        while (aft != null){
            if (set.contains(aft.val)){
                pre.next = aft.next;
                aft = aft.next;
            }else {
                pre = aft;
                aft = aft.next;
            }
        }
        return pHead;
    }
}
