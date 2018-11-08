package com.ztesoft.test;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 16:52
 * @Version
 * @Description
 */
public class SerializationList {

    public static void main(String [] args){
           People people = new People();
           people.setId("123");
           Person person1 = new Person("Sam",21);
           Person person2 = new Person("Aim",20);
           List<Person> personList = new ArrayList<>();
           personList.add(person1);
           personList.add(person2);
           people.setPersonList(personList);
           String text = JSON.toJSONString(people);
           System.out.println(text);

           People people1 = JSON.parseObject(text,People.class);
           System.out.println(people1.getId()+"---"+people1.getPersonList().get(0).getName());
    }
}
