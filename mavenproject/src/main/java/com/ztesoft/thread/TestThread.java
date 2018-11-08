package com.ztesoft.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 10:37
 * @Version
 * @Description
 */
public class TestThread {
    public static void main(String [] args){
           long startTime = System.currentTimeMillis();
           //创建计数器
           CountDownLatch countDownLatch = new CountDownLatch(5);
           for(int i = 0;i<5;i++){
               Thread thread = new Demo3(countDownLatch);
               thread.start();
           }

            try {
                // 阻塞当前线程，直到倒数计数器倒数到0
                countDownLatch.await();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("子线程执行时间"+(endTime-startTime));
    }
}
