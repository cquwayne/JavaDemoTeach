package com.lianxi;

class Test {}

public class Test307 {
    public static void main (String[] args){
        Test t1 = new Test();
        if (t1 instanceof Test){
            System.out.println("t1是Teat类的一个对象实例");
        }
        String s = null;
        s = (t1 == null)? "t1是一个空对象":"t1已创建！";
        System.out.println(s);
    }
}
