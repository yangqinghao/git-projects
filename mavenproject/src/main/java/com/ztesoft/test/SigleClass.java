package com.ztesoft.test;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 18:21
 * @Version
 * @Description
 */
public class SigleClass {
    private SigleClass(){}

    private static SigleClass sigleClass;

    public static SigleClass getSigleClass(){
        if(sigleClass == null){
                sigleClass = new SigleClass();
        }
        return sigleClass;
    }
}
