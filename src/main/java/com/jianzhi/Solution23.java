package com.jianzhi;

public class Solution23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
       if (sequence == null || sequence.length == 0){
           return false;
       }
       return dfs(sequence, 0, sequence.length-1);
    }
    public static boolean dfs (int [] sequence, int start, int end){
        if (start >= end){
            return true;
        }
        int root = end;
        int flag = start;
        for (int i = 0; i < end; i++) {
            if (sequence[i]>sequence[root]){
                for (int j = i+1; j < end; j++) {
                    if (sequence[j]<sequence[root]){
                        return false;
                    }
                }
                flag = i;
            }
        }
        return dfs(sequence,start,flag-1)&&dfs(sequence,flag,end-1);
    }
}
