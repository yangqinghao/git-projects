package com.ztesoft.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yangqinghao on 2018/9/20 14:13
 */
public class CatchPool {
    ExecutorService executorService = Executors.newCachedThreadPool();
//    for(int i = 0;i < 4;i++){
//        executorService.execute(new ListOff());
//        executorService.shutdown();
//    }

}
