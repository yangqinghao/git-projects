package com.ztesoft.proxy;

import com.ztesoft.proxy.impl.ProductClothesImpl;
import com.ztesoft.proxy.impl.ProductShotImpl;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 17:56
 * @Version
 * @Description
 */
public class test {
    public static void main(String [] args){
           ProductShots shot = new ProductShotImpl();
           ProxyService proxy = new ProxyService();
           proxy.setFactory(shot);
           ProductShots shotFactory = (ProductShots) proxy.getProxyInstance(shot);
           shotFactory.productShots("30");

           ProductClothes clothes = new ProductClothesImpl();
           proxy.setFactory(clothes);
           ProductClothes clothesFactoy = (ProductClothes) proxy.getProxyInstance(clothes);
           clothesFactoy.productClothes("80");
    }
}
