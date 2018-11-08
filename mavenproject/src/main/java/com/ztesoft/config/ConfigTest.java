package com.ztesoft.config;

import org.apache.log4j.Logger;
import java.util.Properties;
import java.util.Set;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/15 14:22
 * @Version
 * @Description
 */
public class ConfigTest {

    private static Logger logger = Logger.getLogger(ConfigTest.class.getClass());

    public static void main(String [] args){
        logger.info("start main function");
        Properties pers = System.getProperties();
        Set keys = pers.keySet();
    }
}
