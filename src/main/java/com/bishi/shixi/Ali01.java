package com.bishi.shixi;

import java.util.Arrays;
import java.util.Scanner;

public class Ali01 {
    public static long sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n ==0){
            System.out.println(0);
            return;
        }
        long [] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        qh(a);
        System.out.println(sum);
    }

    public static void qh (long [] x){
        if (x.length == 1){
            return;
        }
        for (int i = 0; i < x.length; i++) {
            sum =sum + (x[i] - x[0]);
        }
        long [] res = new long [x.length-1];
        if (res.length >= 0) {
            System.arraycopy(x, 1, res, 0, res.length);
        }
        qh(res);
    }
}
