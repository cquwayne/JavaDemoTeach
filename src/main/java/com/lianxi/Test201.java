package com.lianxi;

public class Test201 {
    public static void main (String[] arg){
        Car car = new Car(8, 4);
        System.out.println(" 8+4 = " + car.add());
        System.out.println(" 8-4 = " + car.sub());
        System.out.println(" 8*4 = " + car.mul());
        System.out.println(" 8/4 = " + car.div());
    }
}
class Car{
    int i,j;
    Car(int a, int b){
        i = a;
        j = b;
    }
    int add(){
        return i + j;
    }
    int sub(){
        return i - j;
    }
    int mul(){
        return i * j;
    }
    int div(){
        return i / j;
    }
}
