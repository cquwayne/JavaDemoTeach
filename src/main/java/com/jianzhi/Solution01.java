package com.jianzhi;

//暴力解法

public class Solution01 {
    public static boolean Find(int target, int [][] array) {
        int i,j;
        for (i=0; i<array[0].length; i++){
            for (j=0; j<array.length; j++){
                if (target==array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int a = 17;
        if (Find(a, arr) == true) {
            System.out.println("该二维数组中包含" + a);
        } else {
            System.out.println("该二维数组中不包含" + a);
        }
    }
}
