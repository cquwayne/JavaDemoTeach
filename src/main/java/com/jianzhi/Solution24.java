package com.jianzhi;

import java.util.ArrayList;

public class Solution24 {
    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || root.val>target){
            return null;
        }
        dfs(root, target, new ArrayList<Integer>());
        return arrayList;
    }
    public void dfs (TreeNode root, int sum, ArrayList<Integer> list){
        sum -= root.val;
        list.add(root.val);

        if (root.right == null && root.left == null && sum == 0){
            arrayList.add(new ArrayList<>(list));
        }
        if (root.left != null){
            dfs(root.left, sum, list);
        }
        if (root.right != null){
            dfs(root.right, sum, list);
        }
        list.remove(list.size()-1);
    }
}
