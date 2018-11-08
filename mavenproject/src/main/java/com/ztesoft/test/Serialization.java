package com.ztesoft.test;

import com.alibaba.fastjson.JSON;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 16:38
 * @Version
 * @Description
 */
public class Serialization {
      public static void main(String [] args){
             Person person = new Person("sam",18);
             String text = JSON.toJSONString(person);
             System.out.println(text);
             Person person1 = JSON.parseObject(text,Person.class);
             System.out.println(person1.getName()+person1.getAge());
      }

}
