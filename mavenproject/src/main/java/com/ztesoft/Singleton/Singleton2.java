package com.ztesoft.Singleton;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 15:26
 * @Version
 * @Description
 * 懒汉式
 */
public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 singleton2;

    public static  Singleton2 getSingleton(){
        if (singleton2 == null){
            synchronized (Singleton2.class){
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }
}
