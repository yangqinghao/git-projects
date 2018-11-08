package com.ztesoft.config;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/12 14:27
 * @Version
 * @Description
 */
public class PropertyTest {
    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PropertyTest.class);
    public static void main(String [] args){
        logger.info("start getProperties");
        getProperties("F:/mavenproject/src/main/java/com/ztesoft/config/config.properties","name");
    }

    public static void getProperties(String filePath,String keyword){
        logger.info("start getProperties");
        Properties prop = new Properties();
        try {
            //prop.load(new BufferedReader(new FileReader(new File(filePath))));
            prop.load(PropertyTest.class.getResourceAsStream(filePath));
            Set<Map.Entry<Object,Object>> entrySet = prop.entrySet();
            for(Map.Entry<Object,Object> entry : entrySet){
                System.out.println(entry.getKey()+"---"+entry.getValue());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
