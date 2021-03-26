package com.jianzhi;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution40 {
    public int[] FindNumsAppearOnce (int[] array) {
        int [] arr = new int [2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i<array.length; i++){
            if (map.containsKey(array[i]) == false){
                map.put(array[i],1);
            }else {
                map.put(array[i], map.get(array[i])+1);
            }
        }
        ArrayList<Integer> keyList = new ArrayList<>();
        for (int i : map.keySet()){
            if (map.get(i).equals(1)){
                keyList.add(i);
            }
        }
        if (keyList.get(0) < keyList.get(1)){
            arr[0] = keyList.get(0);
            arr[1] = keyList.get(1);
        }else {
            arr[0] = keyList.get(1);
            arr[1] = keyList.get(0);
        }
        return arr;
    }
}
