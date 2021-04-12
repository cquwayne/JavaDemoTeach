package com.lianxi;

//利用Thread， 实现多线程同步下载图片

public class TestThread2 extends Thread{
    private String url;
    private String name;

    public TestThread2(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run(){

        System.out.println("下载文件名为："+name);
    }
}
