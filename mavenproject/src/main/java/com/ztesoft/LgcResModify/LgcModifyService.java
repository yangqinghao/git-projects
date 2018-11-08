package com.ztesoft.LgcResModify;

import java.util.List;
import java.util.Map;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/26 14:37
 * @Version
 * @Description
 */
public interface LgcModifyService {

    void modifyState(Map<String,Object> paramMap , List<ResEntity>resEntityList);
}
