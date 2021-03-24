package com.jianzhi;


class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;
   public TreeNode(int val) {
     this.val = val;
   }
 }
public class Solution18 {
    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null){
            return null;
        }
        if (pRoot.left == null & pRoot.right == null){
            return null;
        }
        TreeNode res = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = res;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
