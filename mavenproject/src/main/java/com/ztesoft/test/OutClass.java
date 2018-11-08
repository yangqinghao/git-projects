package com.ztesoft.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 18:14
 * @Version
 * @Description
 */
public class OutClass {

    private  String outter = "outter";

    public  void test(){
        InnterClass intter = new InnterClass();
        intter.test();
    }
    class InnterClass implements ActionListener{
        String innter = "innter";

        public  void test(){
            System.out.println("innter");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = OutClass.this.outter;
            System.out.println(str);
        }
    }
}
