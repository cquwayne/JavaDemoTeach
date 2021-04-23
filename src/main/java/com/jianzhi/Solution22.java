package com.jianzhi;

import java.util.ArrayList;

//广度优先 BFS

public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<TreeNode> treeList = new ArrayList<>();
        if (root == null){
            return arrayList;
        }
        treeList.add(root);
        while (treeList.size()!= 0){
            TreeNode node = treeList.get(0);
            arrayList.add(node.val);
            if (node.left!=null){
                treeList.add(node.left);
            }
            if (node.right!=null){
                treeList.add(node.right);
            }
            treeList.remove(0);
        }
        return arrayList;
    }
}
