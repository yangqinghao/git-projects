package com.ztesoft.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 15:38
 * @Version
 * @Description
 */
public class MultThread {
    public static void main(String [] args){
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for(int i = 0 ; i < 100 ; i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+Singleton2.getSingleton());
                }
            });
        }
        threadPool.shutdown();
    }
}
