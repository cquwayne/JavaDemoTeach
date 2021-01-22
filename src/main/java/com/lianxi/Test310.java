package com.lianxi;

public class Test310 {
    public static void main(String[] args){
        int  x, y, z;
        int max = 0;
        int[] weng = new int[5];
        x = Integer.parseInt(String.valueOf(weng[0]));
        y = Integer.parseInt(String.valueOf(weng[1]));
        z = Integer.parseInt(String.valueOf(weng[2]));
        if (x > y){
            if (x > z){
                max = x;
            }
            else if (x < z){
                max = z;
            }
        }
        else if (x < y){
            if (y > z){
                max = y;
            }
            else if (y < z){
                max = z;
            }
        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("max=" + max);
    }
}
