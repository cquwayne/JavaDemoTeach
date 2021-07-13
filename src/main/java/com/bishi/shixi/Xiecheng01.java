package com.bishi.shixi;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Scanner;

public class Xiecheng01 {
    static int n;
    static int [] visit;
    static ArrayList<Character> path = new ArrayList<>();
    static ArrayList<String> ans = new ArrayList<>();
    static int start;
    static int end;
    static int [][] Graph ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        visit = new int[n];
        Graph = new int[n][n];
        if (in.hasNextLine()){
            String a =in.nextLine();
            String [] as = a.split(" ");
            for (int i = 0; i < as.length; i++) {
                Graph[Integer.parseInt(String.valueOf(as[i].charAt(0)))] [Integer.parseInt(String.valueOf(as[i].charAt(2)))]=1;
            }
        }
        if (in.hasNextLine()){
            String b =in.nextLine();
            String [] bs = b.split(" ");
            start = Integer.parseInt(bs[0]);
            end = Integer.parseInt(bs[1]);
        }
        int zuidazhongzhuan = Integer.parseInt(in.nextLine());
        System.out.println(end);
        System.out.println(zuidazhongzhuan);
    }
    static void dfs(int u){
        visit [u] = 1;
        path.add((char)((int)'A'+u));
        if (u == end) {
            ans.add(path.toString());
        }else {
            for (int i = 0; i < n; i++) {
                if (visit[i]==0 && i != Graph[u][i]){
                    dfs(i);
                }
            }
        }
    }
}
