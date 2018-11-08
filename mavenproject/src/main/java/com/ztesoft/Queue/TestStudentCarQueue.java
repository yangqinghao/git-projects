package com.ztesoft.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/31 15:20
 * @Version
 * @Description
 */
public class TestStudentCarQueue {
    public static void main(String [] args) throws InterruptedException {
        int studentNum = 1000;//学生数
        int CarNum = 10;//车辆数
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        CountDownLatch countDownLatch = new CountDownLatch(CarNum);
        //将学生放进队列
        for (int i = 1; i < studentNum+1;i++){
            queue.offer("编号"+i+"学生");
        }
        long startTime = System.currentTimeMillis();
        //创建线程池
        ExecutorService service = Executors.newCachedThreadPool();
        for(int x = CarNum;x>0;x--){
            service.submit(new Car("car"+x,countDownLatch,queue));
        }
        countDownLatch.await();
//        Iterator iterator =  queue.iterator();
//        while (iterator.hasNext()){
//            System.out.println("剩余学生编号"+iterator.next());
//        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime-startTime));
        service.shutdown();
    }
}
