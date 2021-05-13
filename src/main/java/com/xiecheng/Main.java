package com.xiecheng;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//1.    当输入非数字,输出：N
//
//2.    当输入数字超出限制时，输出O
//
//3.     符合条件时输出当前道路上房子从左到右的排列
//GGRGGRRGGGRRGRRRGGRGGRRRGGRRGRR

public class Main {

//    static String buildingHouse(String n) {
////        String l = "O";
////        String m = "N";
////        String P = "R";
////        String Q = "";
////        if (n.isEmpty()||n.length()>2){
////            return m;
////        }
////        int x = Integer.parseInt(n);
////        if (x<=0 || x>12){
////            return l;
////        }
////        for (int i=0; i<x-1; i++){
////            for (int j=0; j<P.length(); j++){
////                if (P.charAt(j) == 'G'){
////                    Q += 'G';
////                }else if (P.charAt(j) == 'R'){
////                    Q += "GRR";
////                }
////            }
////            P = Q;
////            Q = "";
////        }
////        return P;
////        String y = Integer.toString(x);
//        for (int i = 0;)
//
//    }
//    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res=in.nextLine();
        find(res);

//        String _n;
//        try {
//            _n = in.nextLine();
//        } catch (Exception e) {
//            _n = null;
//        }
//
//        res = buildingHouse(_n);
//        System.out.println(res);
    }

    public static void find(String ss) {
        for(int i=0;i<ss.length();i++) {
            if (ss.charAt(i)>'9'||ss.charAt(i)<'0'){
                System.out.println("N");
                return;
            }
        }
        if (Integer.parseInt(ss)>12||Integer.parseInt(ss)<1) {
            System.out.println("O");
            return;
        }
        String s0= "R";
        int i = Integer.parseInt(ss);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        int tap = 2;
        if (i==1) {
            System.out.println(s0);
            return ;
        }
        for(int j=i;j>1;j--) {
            tap = 0;
            for(int m=0;m<s0.length();m++) {
                if(arrayList.contains(m-tap)){
                    s0 = s0.substring(0,m)+'G'+s0.charAt(m)+'R'+s0.substring(m+1);
                    arrayList1.add(m);
                    arrayList1.add(m+2);
                    m += 2;
                    tap+=2;
                }
            }
            arrayList.clear();
            for (int n=0;n<arrayList1.size();n++) {
                arrayList.add(arrayList1.get(n));
            }
            arrayList1.clear();
        }
        System.out.println(s0);
        return ;
    }
}

