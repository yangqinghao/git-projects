package com.ztesoft.test;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/12 16:14
 * @Version
 * @Description
 */
public class Parent {
    static {
        System.out.println("Parent static");
    }

    public Parent() {
        System.out.println("parent constructor");
    }
}
