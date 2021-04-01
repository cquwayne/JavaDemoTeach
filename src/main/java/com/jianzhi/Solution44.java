package com.jianzhi;

import java.util.ArrayList;

public class Solution44 {
    public static String ReverseSentence(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if(str.trim().length() == 0){
            return str;}
        for (int i=0,j=0; j<str.length(); j++){
            if (i==0 && str.charAt(j)==' '){
                arrayList.add(' '+str.substring(i,j));
                i=j;
            }else if (i!=0 && str.charAt(j)==' '){
                arrayList.add(str.substring(i,j));
                i=j;
            }else if (j==str.length()-1 && arrayList.size()==0){
                arrayList.add(str.substring(i));
            }else if (j==str.length()-1 && arrayList.size()!=0){
                arrayList.add(str.substring(i+1));
            }
        }
        String str1 = new String();
        int num = arrayList.size();
        while (num > 0){
            str1 += arrayList.get(num - 1);
            num --;
        }
        return str1;
    }

    public static void main(String[] args) {
        String str2 = "Wonderfull";
        System.out.println(ReverseSentence(str2));
    }
}
