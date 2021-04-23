package com.jianzhi;
//链表中环的入口结点

//解题思路
//1、先判断链表中有没有环
//2、然后计算出该环内节点的个数
//3、最后让一个指针先走环的个数的步数，另外一个指针去追

public class Solution55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return null;
        }
        ListNode cur1 = pHead;
        ListNode cur2 = pHead.next;
        boolean flag = false;
        while (cur2.next != null && cur2.next.next != null){
            if (cur1 == cur2){
                flag = true;
                break;
            }
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
        //若无环返回null
        if (flag == false){
            return null;
        }
        //有环则计算环内节点个数
        int counter = 1;
        cur2 = cur2.next;
        while (cur1 != cur2){
            counter++;
            cur2 = cur2.next;
        }
        //指针1在起点
        //指针2在起点先走counter步
        cur1 = pHead;
        cur2 = pHead;
        for (int i = 0; i < counter; i++) {
            cur2 = cur2.next;
        }
        //指针1和指针2同时出发，两者内容相等时即为入口节点
        while (cur2 != cur1){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
