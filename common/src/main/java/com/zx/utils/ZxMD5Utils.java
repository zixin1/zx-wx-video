package com.zx.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class ZxMD5Utils {
    /**
     * 对字符串进行md5加密
     */
    public static String getMD5Str(String strValue){
        MessageDigest md5= null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String news= Base64.encodeBase64String(md5.digest(strValue.getBytes()));
        return news;
    }


    //测试
    public static void main(String[] args){
        try {
            String md5=getMD5Str("ioomc");
            System.out.println(md5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
