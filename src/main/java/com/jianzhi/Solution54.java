package com.jianzhi;

import java.util.HashMap;
import java.util.Map;

public class Solution54 {
    //Insert one char from stringstream

    String caseout = "";
    Map<Character,Integer> map = new HashMap<>();

    public void Insert(char ch)
    {
        caseout += ch;
        if (!map.containsKey(ch)){
           map.put(ch,1);
        }else {
            map.replace(ch,map.get(ch)+1);
        }
    }
    //return the first appearence once char in current stringstream

    public char FirstAppearingOnce()
    {
        for (int i = 0; i < caseout.length(); i++) {
            if (map.get(caseout.charAt(i)) == 1){
                return caseout.charAt(i);
            }
        }
        return '#';
    }
}
