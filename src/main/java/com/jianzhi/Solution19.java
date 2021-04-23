package com.jianzhi;

import java.util.ArrayList;

public class Solution19 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return arrayList;
        }
        int up = 0;
        int down = matrix[0].length-1;
        int left = 0;
        int right = matrix.length-1;
        while (true){
//            打印上层
            for (int i = left; i <= right; i++) {
                arrayList.add(matrix[up][i]);
            }
            up ++;
            if (up>down){
                break;
            }
//            打印右边
            for (int i = up; i <= down; i++) {
                arrayList.add(matrix[i][right]);
            }
            right--;
            if (left>right){
                break;
            }
//            打印下层
            for (int i = right; i >= left; i--) {
                arrayList.add(matrix[down][i]);
            }
            down--;
            if (up>down){
                break;
            }
//            打印左边
            for (int i = down; i >= up; i--) {
                arrayList.add(matrix[i][left]);
            }
            left++;
            if (left>right){
                break;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int [][] test = {{1},{2},{3},{4}};
        int [][] test1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printMatrix(test));
    }
}
