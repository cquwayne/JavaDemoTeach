package com.bishi;

import java.util.Arrays;
import java.util.Scanner;

public class Weizhong02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int [] m = new int [n];
        if (n <= 0){
            System.out.print(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            m[i] = in.nextInt();
        }
        int y = top(m);
        System.out.print(y);
    }
    static int top (int [] x){
        if (x.length == 1){
            return 1;
        }
        int y = 0;
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            if (x[i]>=x[x.length-1]){
                y++;
            }
        }
        return y;
    }
}
