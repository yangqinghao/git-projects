package com.ztesoft.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 17:46
 * @Version
 * @Description
 */
public class ProxyService implements InvocationHandler{

    private Object factory;

    public void setFactory(Object factory) {
        this.factory = factory;
    }

    public Object getFactory() {
        return factory;
    }

    public Object getProxyInstance(Object factory){
        return  Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dosomethingBefor();
        Object obj = method.invoke(factory,args);
        dosomethingAfter();
        return obj;
    }

    private void dosomethingAfter() {
        System.out.println("执行方法后dosomething");
    }

    private void dosomethingBefor() {
        System.out.println("执行方法前dosomething");
    }
}
