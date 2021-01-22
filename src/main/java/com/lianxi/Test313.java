package com.lianxi;

public class Test313 {
    public static void main(String[] args){
        int i, oddSum, evenSum;
        i = 1;
        oddSum = 0;
        evenSum = 0;
        do {
            if (i % 2 == 0){
                evenSum += i;
            }
            else {
                oddSum += i;
            }
            i ++;
        }
        while (i <= 50);
        System.out.println("1~50之间奇数和为：" + oddSum);
        System.out.println("1~50之间偶数和为：" + evenSum);

    }
}
