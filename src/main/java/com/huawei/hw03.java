package com.huawei;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by waynehe on 2021/7/14 11:41 下午
 */
public class hw03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //int num1 = Integer.parseInt(in.nextLine());
        Set<Integer> hashset = new HashSet<>();
        for (int i = 0; i < num; i++) {
            hashset.add(Integer.parseInt(in.nextLine()));
        }
        Object[] arrayList = hashset.toArray();
        Arrays.sort(arrayList);
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }
    }
}
