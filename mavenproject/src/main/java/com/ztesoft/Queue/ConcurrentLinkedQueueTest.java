package com.ztesoft.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/31 14:23
 * @Version
 * @Description 链表式安全队列，先进先出
 */
public class ConcurrentLinkedQueueTest {
    public static void main(String [] args){
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("add");
        //放到队尾
        queue.offer("offer");
        Object [] objs = queue.toArray();
        String [] strs = new String[objs.length];
        queue.toArray(strs);
        System.out.println(strs[0]+strs[1]);
        //System.out.println(queue.isEmpty());
        //获取并去除队列的头
        //System.out.println(queue.poll());
        //获取并不去掉队列的头
        //System.out.println(queue.peek());
        //System.out.println(queue.remove("add"));
        //System.out.println(queue.contains("offer"));
    }
}
