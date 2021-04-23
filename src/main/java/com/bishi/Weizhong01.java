package com.bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Weizhong01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int [] [] array = new int[m][2];
        for (int i = 0; i < m; i++) {
            array[i][0] = in.nextInt();
            array[i][1] = in.nextInt();
        }
        int [] array2 = ping(arr,array);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }
    }
    static int[] ping (int [] arr1,int [] [] array1){
        ArrayList<Integer> arr2 = new ArrayList<>();
        int [] pingjun =new  int [arr1.length];
        for (int i = 0; i < array1.length-1; i++) {
            arr2.add(array1[i][0]);
            arr2.add(array1[i][1]);
            if (array1[i][1]==array1[i+1][0]){
                arr2.add(array1[i+1][1]);
                continue;
            }
            if (array1[i][1]!=array1[i+1][0]){
                int zhi = 0;
                for (int j = 0; j < arr2.size(); j++) {
                    zhi += arr1[arr2.get(j)];
                }
                zhi = zhi/arr2.size();
                for (int j = pingjun.length; j < arr2.size(); j++) {
                    pingjun[j] = zhi;
                }
                arr2.clear();
            }
        }
        return pingjun;
    }
}
