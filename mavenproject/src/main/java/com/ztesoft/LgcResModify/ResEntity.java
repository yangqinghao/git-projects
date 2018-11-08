package com.ztesoft.LgcResModify;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/26 14:29
 * @Version
 * @Description
 */
public class ResEntity {

    private String resId;
    private String resTypeId;

    public void setResId(String resId) {
        this.resId = resId;
    }

    public void setResTypeId(String resTypeId) {
        this.resTypeId = resTypeId;
    }

    public String getResId() {
        return resId;
    }

    public String getResTypeId() {
        return resTypeId;
    }

    public ResEntity(String resTypeId) {
        this.resTypeId = resTypeId;
    }
}
