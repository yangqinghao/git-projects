package com.ztesoft.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by yqh on 2018/9/10.
 */
public class Test {
    public static void main(String [] args){
        try {
            Class c = Class.forName("com.ztesoft.test.ResEntity");
            Method [] methods = c.getDeclaredMethods();
            Annotation [] annotations = new Annotation[4];
            for(Method method : methods){
                annotations = method.getDeclaredAnnotations();
                System.out.println(method.getName());
            }
            for(Annotation an : annotations){
                System.out.println(an.annotationType().getSimpleName());
                Method [] mes = an.annotationType().getMethods();
                for(Method method :mes){
                    System.out.println(method.getName());
                }
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
