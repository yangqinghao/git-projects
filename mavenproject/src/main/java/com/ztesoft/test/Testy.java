package com.ztesoft.test;

/**
 * @author Created by yangqinghao
 * @Date 2018/9/20 14:16 admin
 * @Description
 */
public class Testy {
    public static void main(String [] args){
        for (int i=0;i<5;i++){
           Thread thread = new Thread(new ListOff());
           thread.start();
           System.out.println("任务开始");
        }
    }
}
