package com.ztesoft.adapter;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/15 15:38
 * @Version
 * @Description  适配器
 */
public class VoltageAdpter extends Voltage220 implements Voltage5{
    @Override
    public int output5() {
        int v220 = output220();
        int v5 = v220/4;
        return v5;
    }
}
