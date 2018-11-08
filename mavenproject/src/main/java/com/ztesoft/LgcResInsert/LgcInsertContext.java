package com.ztesoft.LgcResInsert;

import com.ztesoft.LgcResModify.LgcModifyService;
import com.ztesoft.LgcResModify.LgcPortModifyServiceImpl;
import com.ztesoft.LgcResModify.ResEntity;
import java.util.List;
import java.util.Map;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/26 15:58
 * @Version
 * @Description
 */
public class LgcInsertContext {

    private final static String IP = "IP";

    private Map<String,Object> paramMap;

    private List<ResEntity> resEntityList;

    private LgcModifyService lgcModifyService;

    public LgcModifyService getLgcModifyService() {
        return lgcModifyService;
    }

    public void setLgcModifyService(LgcModifyService lgcModifyService) {
        this.lgcModifyService = lgcModifyService;
    }

    public LgcInsertContext(Map<String, Object> paramMap, List<ResEntity> resEntityList) {
        this.paramMap = paramMap;
        this.resEntityList = resEntityList;
        for(ResEntity resTypeId : resEntityList){
            insertRes(resTypeId.getResTypeId());
        }
    }

    private void insertRes(String resTypeId) {
        if(IP.equals(resTypeId)){
            setLgcModifyService(new LgcPortModifyServiceImpl());
        }
    }

    public void getInsertData(){
        getLgcModifyService().modifyState(paramMap,resEntityList);
    }
}
