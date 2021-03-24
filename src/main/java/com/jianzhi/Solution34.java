package com.jianzhi;

import java.util.HashMap;

public class Solution34 {
    public int FirstNotRepeatingChar(String str) {

        if (str == null && str.length() == 0){
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0,j=0; i<str.length(); i++){
            if (map.containsKey(str.charAt(i))==false){
                map.put(str.charAt(i),1);
            }else {
                j=map.get(str.charAt(i));
                map.put(str.charAt(i),j+1);
            }
        }
        for (int m=0; m<str.length(); m++){
            if (map.get(str.charAt(m))==1){
                return m+1;
            }
        }
        return -1;
    }
}
