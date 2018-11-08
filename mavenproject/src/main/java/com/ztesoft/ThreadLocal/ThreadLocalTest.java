package com.ztesoft.ThreadLocal;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/22 17:01
 * @Version
 * @Description ThreadLocal
 */
public class ThreadLocalTest {

    ThreadLocal<Long> threadLocalLong = new ThreadLocal<Long>(){
        protected Long initialValue(){
            return Thread.currentThread().getId();
        }
    };

    ThreadLocal<String> threadLocalString = new ThreadLocal<String>(){
        protected String initialValue(){
            return Thread.currentThread().getName();
        }
    };

    public void set(){
        threadLocalLong.set(Thread.currentThread().getId());
        threadLocalString.set(Thread.currentThread().getName());
    }

    public Long getLong(){
        return threadLocalLong.get();
    }

    public String getString(){
        return threadLocalString.get();
    }

    public static void main(String [] args) throws InterruptedException {
            final ThreadLocalTest test = new ThreadLocalTest();
            //test.set();
            System.out.println( test.getLong());
            System.out.println(test.getString());
            for(int i = 1;i<8;i++){
                Thread thread = new Thread(){
                    public void run(){
                        // test.set();
                        System.out.println(test.getLong()+"-----"+test.getString());
                    }
                };
                thread.start();
                thread.join();
                System.out.println( test.getLong());
                System.out.println(test.getString());
            }
        System.out.println( test.getLong());
        System.out.println(test.getString());

    }
}
