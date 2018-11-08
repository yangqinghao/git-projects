package com.ztesoft.proxy.impl;

import com.ztesoft.proxy.ProductShots;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 17:45
 * @Version
 * @Description
 */
public class ProductShotImpl implements ProductShots{
    @Override
    public void productShots(String shotSize) {
        System.out.println("生产的鞋子尺码是"+shotSize);
    }
}
