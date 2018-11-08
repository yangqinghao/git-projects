package com.ztesoft.enumTest;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/31 17:07
 * @Version
 * @Description
 */
public enum EnumTest {
    EnumTest1(true,"123"){
        @Override
        public void getName(String name) {
            System.out.println(name);
        }
    };
    String name;
    boolean flag;

    EnumTest(boolean flag,String name) {
        this.flag = flag;
        this.name = name;
    }
    public abstract void getName(String name);


}
