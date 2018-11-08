package com.ztesoft.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/31 15:13
 * @Version
 * @Description 有10辆100座的大巴车，1000名学生一次登上
 */
public class Car implements Runnable{
    private String carNum;
    private CountDownLatch count ;
    int placeNum = 100;//每辆车座位数量
    private ConcurrentLinkedQueue<String> concurrentLinkedQueue;

    public Car(String carNum, CountDownLatch count, ConcurrentLinkedQueue<String> concurrentLinkedQueue) {
        this.carNum = carNum;
        this.count = count;
        this.concurrentLinkedQueue = concurrentLinkedQueue;
    }

    @Override
    public void run() {
            for(int i = 1 ;i < placeNum+1;i++){
                System.out.println("学生"+concurrentLinkedQueue.poll()+",坐上"+carNum+"车的编号为"+i+"的座位");
            }
            count.countDown();
    }
}
