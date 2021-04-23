package com.jianzhi;

public class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null || root1 == null){
            return false;
        }
        return result(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    boolean result(TreeNode A, TreeNode B){
        if (B == null){
            return true;
        }
        if (A == null || A.val!=B.val){
            return false;
        }
        return result(A.left,B.left) && result(A.right,B.right);
    }
}
