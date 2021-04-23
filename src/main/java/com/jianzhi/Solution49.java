package com.jianzhi;

public class Solution49 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        if (Math.abs(depth(root.left)-depth(root.right)) > 1){
            return false;
        }
        return IsBalanced_Solution(root.right) && IsBalanced_Solution(root.left);
    }
    int depth (TreeNode root1){
        if (root1 == null){
            return 0;
        }
        return Math.max(depth(root1.left),depth(root1.right))+1;
    }
}
