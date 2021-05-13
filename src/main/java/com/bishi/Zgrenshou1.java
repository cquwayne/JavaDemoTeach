package com.bishi;

import java.util.*;

public class Zgrenshou1 {
    static ArrayList<String> arrayList = new ArrayList<>();
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            String a = in.nextLine();
            String[] as = a.split(" ");
            Collections.addAll(arrayList, as);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (hashMap.containsKey(arrayList.get(i))){
                hashMap.replace(arrayList.get(i),hashMap.get(arrayList.get(i))+1);
            }
            if (!hashMap.containsKey(arrayList.get(i))){
                hashMap.put(arrayList.get(i),1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList(hashMap.entrySet());
        Collections.sort(list, (o1, o2) -> (o1.getValue() - o2.getValue()));
        System.out.println(list.get(hashMap.size()-1).getKey());
    }

}
