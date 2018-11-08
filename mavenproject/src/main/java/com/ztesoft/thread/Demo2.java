package com.ztesoft.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 10:23
 * @Version
 * @Description
 * 线程池
 */
public class Demo2 {
    public static void main(String [] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<8;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.class.getSimpleName());
                }
            });
        }
        executorService.isShutdown();
    }
}
