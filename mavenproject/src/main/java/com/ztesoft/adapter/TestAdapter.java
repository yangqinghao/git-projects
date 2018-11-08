package com.ztesoft.adapter;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/15 15:40
 * @Version
 * @Description
 */
public class TestAdapter {

    public void getVoltage(Voltage5 voltage5){
        if(voltage5.output5() == 5){
            System.out.println("==");
        }
        else if(voltage5.output5()>=5) {
            System.out.println(">=");
        }
    }

    public static void main(String [] args){
           TestAdapter adapter = new TestAdapter();
           adapter.getVoltage(new VoltageAdpter());
    }
}
