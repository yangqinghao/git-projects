package com.ztesoft.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/10 10:15
 * @Version
 * @Description
 */
public class HostAddress {
    public static void main(String [] args){
        InetAddress address = null;
        try {
            address = InetAddress.getByName("oa.iwhalecloud.com");
            System.out.println(address.getHostName()+"IP is:"+address.getHostAddress());
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
