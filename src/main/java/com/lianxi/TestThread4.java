package com.lianxi;

//多个线程同时操作同一个对象
//买火车票的例子


//发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱

import javax.naming.Name;

public class TestThread4 implements Runnable{
    private int ticketNum = 10;

    @Override
    public void run(){
        while (true){
            if (ticketNum <= 0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第"+ticketNum-- + "票");
        }
    }

    public static void main(String[] args) {

        TestThread4 testThread4 = new TestThread4();

        new Thread(testThread4, "小明").start();
        new Thread(testThread4, "小红").start();
        new Thread(testThread4, "小张").start();
    }
}
