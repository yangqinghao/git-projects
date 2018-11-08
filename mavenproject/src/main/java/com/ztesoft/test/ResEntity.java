package com.ztesoft.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/11 14:21
 * @Version
 * @Description
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ResEntity {

     public String id() default "";

     public  String description() default "no description";
}
