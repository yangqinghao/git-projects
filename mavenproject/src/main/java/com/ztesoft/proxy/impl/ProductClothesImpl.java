package com.ztesoft.proxy.impl;

import com.ztesoft.proxy.ProductClothes;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 17:42
 * @Version
 * @Description
 */
public class ProductClothesImpl implements ProductClothes{

    @Override
    public void productClothes(String clotheSize) {
        System.out.println("成产的衣服尺寸是"+clotheSize);
    }
}
