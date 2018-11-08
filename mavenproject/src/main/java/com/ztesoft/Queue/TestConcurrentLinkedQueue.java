package com.ztesoft.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/31 14:39
 * @Version
 * @Description
 */
public class TestConcurrentLinkedQueue {
    public static void main(String [] args) throws InterruptedException {
        int maxPeople = 10000;//就餐人数
        int tableNum = 10;//餐桌数量
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        CountDownLatch countDownLatch = new CountDownLatch(tableNum);//计数器
        //把就餐人放到队列里
        for(int i = 0;i<maxPeople;i++){
            queue.add("就餐人"+i+"号");
        }
        System.out.println("start...");
        long startTime = System.currentTimeMillis();
        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int x = 0;x< tableNum;x++){
            executorService.submit(new Dinner("00"+(x+1),queue,countDownLatch));
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println("end...");
        System.out.println("耗时："+(endTime-startTime));
        executorService.shutdown();
    }
}
