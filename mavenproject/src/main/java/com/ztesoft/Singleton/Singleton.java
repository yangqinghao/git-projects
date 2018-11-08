package com.ztesoft.Singleton;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 15:22
 * @Version
 * @Description
 * 饿汉式单例
 */
public class Singleton {

    private Singleton() {}

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton(){
        return singleton;
    }
}
