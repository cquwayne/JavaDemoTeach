package com.lianxi;

//测试Join方法
//想象插队

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<200; i++){
            System.out.println("线程VIP来了" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int j=0; j<510; j++){
            if (j==50){
                thread.join();
            }
            System.out.println("main..." + j);
        }
    }
}
