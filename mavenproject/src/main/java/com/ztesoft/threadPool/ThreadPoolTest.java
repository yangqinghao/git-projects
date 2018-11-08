package com.ztesoft.threadPool;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/15 18:25
 * @Version
 * @Description 线程池
 */
public class ThreadPoolTest {

    class MyThread implements Callable<String>{

        private String name;
        public MyThread (String name){
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            int sleepTime = new Random().nextInt(1000);
            try {
                Thread.sleep(sleepTime);
            }catch (Exception e){
                e.printStackTrace();
            }
            String str = name +" sleep time "+ sleepTime;
            return str;
        }
    }

    private final int POOL_SIZE = 5;
    private final int TOTAL_TASK = 20;

    //自己写集合来实现获取线程池中任务的返回结果
    public void testQueue()throws Exception{
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
        BlockingDeque<Future<String>> deque = new LinkedBlockingDeque<>();
        //向线程池扔任务
        for (int i = 0 ;i<TOTAL_TASK;i++){
            Future<String> future = pool.submit(new MyThread("Thread1 "+i));
            deque.add(future);
        }
        //检查线程任务执行结果
        for (int i=0;i<TOTAL_TASK;i++) {
            System.out.println("method1  " + deque.take().get());
        }
        pool.shutdown();
    }

    //通过completionService获取线程池返回结果
    public void testCompletionService() throws Exception{
        //创建线程池
        ExecutorService pool = Executors.newCachedThreadPool();
        //管理线程池
        CompletionService<String> cService = new ExecutorCompletionService<String>(pool);
        //向线程池扔任务
        for(int i=0;i<TOTAL_TASK;i++){
            cService.submit(new MyThread("Thread2 "+i));
        }
        //检查线程任务执行结果
        for (int i=0;i<TOTAL_TASK;i++){
            Future<String> future =  cService.take();
            System.out.println("method2  "+future.get());
        }
        //关闭线程池
        pool.shutdown();
    }
    public static void main(String [] args) throws Exception {
        ThreadPoolTest test = new ThreadPoolTest();
        test.testQueue();
        test.testCompletionService();
    }
}
