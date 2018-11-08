package com.ztesoft.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 9:56
 * @Version
 * @Description
 * 定时任务
 */
public class Demo {
    public static void main(String [] args){
           Timer timer  = new Timer();
           //0：无延迟,1000：每隔1秒执行run（）
           timer.schedule(new TimerTask() {
               @Override
               public void run() {
                   System.out.println("启动定时任务");
               }
           },0,1000);
    }
}
