package com.ztesoft.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 16:50
 * @Version
 * @Description
 */
public class People {

    private String id;

    private List<Person> personList = new ArrayList<>();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
