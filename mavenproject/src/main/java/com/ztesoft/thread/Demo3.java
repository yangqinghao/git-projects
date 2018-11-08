package com.ztesoft.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 10:32
 * @Version
 * @Description
 * 主线程等待子线程
 */
public class Demo3 extends Thread{

    private CountDownLatch countDownLatch;
    public Demo3(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    public void run(){
        System.out.println(this.getName()+"Thread start");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName()+"Thread end");
        countDownLatch.countDown();
    }
}
