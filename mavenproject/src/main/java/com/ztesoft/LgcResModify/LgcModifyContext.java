package com.ztesoft.LgcResModify;

import java.util.List;
import java.util.Map;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/26 14:29
 * @Version
 * @Description
 */
public class LgcModifyContext {


    private final static String IP = "IP";
    private final static String PORT = "PORT";
    //修改参数
    private Map<String,Object> paramMap;
    //修改资源集合
    private List<ResEntity> resEntityList;
    //具体修改策略类
    private LgcModifyService lgcModifyService;

    public void setParamMap(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public void setResEntityList(List<ResEntity> resEntityList) {
        this.resEntityList = resEntityList;
    }

    public Map<String, Object> getParamMap() {
        return paramMap;
    }

    public List<ResEntity> getResEntityList() {
        return resEntityList;
    }

    public LgcModifyContext(Map<String, Object> paramMap, List<ResEntity> resEntityList) {
        this.setParamMap(paramMap);
        this.setResEntityList(resEntityList);
        String resTypeId = resEntityList.get(0).getResTypeId();
        createModifyService(resTypeId);
    }

    public void setLgcModifyService(LgcModifyService lgcModifyService) {
        this.lgcModifyService = lgcModifyService;
    }

    public LgcModifyService getLgcModifyService() {
        return lgcModifyService;
    }

    private void createModifyService(String resTypeId) {
        if(IP.equals(resTypeId)){
           setLgcModifyService(new IpLgcModifyServiceImpl());
        }
        else if(PORT.equals(resTypeId)){
            setLgcModifyService(new LgcPortModifyServiceImpl());
        }

    }
    public void getModify(){
        if(lgcModifyService == null){
            return ;
        }
        getLgcModifyService().modifyState(paramMap,resEntityList);
    }

}
