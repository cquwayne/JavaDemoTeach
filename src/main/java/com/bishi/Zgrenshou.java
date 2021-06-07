package com.bishi;

import java.util.Arrays;
import java.util.Scanner;

public class Zgrenshou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        int n;
        int output = 0;
        for (int i = 0; i < T; i++) {
            //每一个测试用例的长度
            n = sc.nextInt();
            int count[]= new int[n];
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                count[j]=sc.nextInt();

            }
            output = match(count);

        }
                System.out.println(output);
    }
    private static int match(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int len =arr.length;
        int halfOfSum=sum/2;
        int matrix_firstDimensionLen=len+1;
        int matrix_secondDimensionLen=halfOfSum+1;
        int[][] matrix= new int[matrix_firstDimensionLen][matrix_secondDimensionLen];
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i]=0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0]=0;

        }
        for (int i = 1; i <matrix_firstDimensionLen ; i++) {
            for (int j = 1; j < matrix_secondDimensionLen; j++) {
                matrix[i][j]=matrix[i-1][j];
                if (j-arr[i-1]>=0&& matrix[i-1][j-arr[i-1]]+arr[i-1]>matrix[i][j]){
                    matrix[i][j] = matrix[i-1][j-arr[i-1]]+arr[i-1];
                }
            }
        }
        return Math.abs(matrix[len][halfOfSum]-(sum-matrix[len][halfOfSum]));
    }
}
