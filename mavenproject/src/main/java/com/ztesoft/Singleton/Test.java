package com.ztesoft.Singleton;

import static com.ztesoft.Singleton.Singleton.getSingleton;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 15:23
 * @Version
 * @Description
 */
public class Test {
   public static void main(String [] args){
       Singleton singleton = getSingleton();
       Singleton singleton1 = getSingleton();
       System.out.println(singleton);
       System.out.println(singleton1);
   }
}
