package com.ztesoft.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/31 14:35
 * @Version
 * @Description
 */
public class Dinner implements Runnable {

    private String deskNo;
    private ConcurrentLinkedQueue<String> queue;
    private CountDownLatch countDownLatch;

    public Dinner(String deskNo, ConcurrentLinkedQueue<String> queue, CountDownLatch countDownLatch) {
        this.deskNo = deskNo;
        this.queue = queue;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
            while (!queue.isEmpty()){
                System.out.println(queue.poll()+"就餐完毕，餐桌编号："+deskNo+"桌");
            }
            countDownLatch.countDown();
    }
}
