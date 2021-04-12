package com.jianzhi;

import java.util.ArrayList;

public class Solution60 {
        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
            if (arrayList == null){
                return null;
            }else {
                ArrayList<Integer> p = new ArrayList<>();
                p.add(pRoot.val);
                arrayList.add(p);
            }
        return null;
        }
}
