package com.ztesoft.test;

/**
 * @Author Created by yangqinghao
 * @Date 2018/11/1 14:33
 * @Version
 * @Description
 */
public class Sequence {
    public static void main(String [] args){
           System.out.println(caculateSequence(4));
    }

    public static int caculateSequence(int num){
        if(num <= 2){
            return 1;
        }
        else{
            System.out.println("caculate+++"+num);
            return caculateSequence(num-1)+caculateSequence(num-2);
        }
    }
}
