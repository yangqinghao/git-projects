package com.ztesoft.LgcResModify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/26 15:40
 * @Version
 * @Description
 */
public class Test {
    public static void main(String [] args){
           Map<String, Object> paramMap = new HashMap<>();
           List<ResEntity> resEntityList = new ArrayList<>();
           resEntityList.add(new ResEntity("IP"));
           LgcModifyContext lgcmodifyContext = new LgcModifyContext(paramMap, resEntityList);
           lgcmodifyContext.getModify();
    }
}
