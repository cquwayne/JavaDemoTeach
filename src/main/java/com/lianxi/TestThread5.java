package com.lianxi;

//模拟龟兔赛跑

public class TestThread5 implements Runnable{
    //胜利者
    private static String winner;

    @Override
    public void run(){
        for (int i = 0; i <= 100; i++){
            //模拟兔子睡觉
            if (Thread.currentThread().getName() == "兔几" && i%20==0){
                try {
                    Thread.sleep(5);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag = gameOver(i);
            //如果比赛结束了，则停止程序
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    private boolean gameOver (int step){
        //判断是否有胜者
        if(winner != null){
            return true;
        }else if (step >= 100){
            winner = Thread.currentThread().getName();
            System.out.println("winner is" + winner);
        }
        return false;
    }

    public static void main(String[] args) {
        TestThread5 testThread5 = new TestThread5();

        new Thread(testThread5,"乌龟").start();
        new Thread(testThread5,"兔几").start();
    }
}
