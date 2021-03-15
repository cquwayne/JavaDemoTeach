package com.jianzhi;

import java.util.ArrayList;

public class Solution13 {
    public static int[] reOrderArray (int[] array) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int m = array.length, n = 0, j = 0;
        for (int i : array){
            if (i % 2 == 1){
                odd.add(i);
                j++;
            }
            else {
                even.add(i);
            }
        }
        while (j!=0){
            array[n] = odd.get(n);
            j--;
            n++;
        }
        while (m>n){
            array[n] = even.get(j);
            n++;
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(reOrderArray(arr));
    }
}
