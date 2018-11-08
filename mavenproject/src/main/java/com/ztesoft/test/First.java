package com.ztesoft.test;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/12 16:13
 * @Version
 * @Description
 */
public class First extends Parent{
    static {
        System.out.println("First static");
    }

    public First() {
        System.out.println("First constructor");
    }
}
