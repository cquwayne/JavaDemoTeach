package com.jianzhi;

//给定一个二叉树其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
//注意，树中的结点不仅包含左右子结点，同时包含指向父结点的next指针。

import java.util.ArrayList;

public class Solution57 {
    //解题思路：暴力解法（三步）
    //1 根据所给结点求出根节点；
    //2 由根节点对该二叉树进行中序遍历，并保存在链表中；
    //3 将所给结点在链表中进行比对，找到下一个结点。

    ArrayList<TreeLinkNode> arrayList = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //第一步
        TreeLinkNode root = pNode;
        while (root.next != null){
            root = root.next;
        }
        //第二步
        Inorder(root);
        //第三步
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == pNode){
                if (i == arrayList.size()-1){
                    return null;
                }else {
                    return arrayList.get(i+1);
                }
            }
        }
        return null;
    }
    void Inorder(TreeLinkNode pNode){
        if (pNode!=null){
            Inorder(pNode.left);
            arrayList.add(pNode);
            Inorder(pNode.right);
        }
    }
}
