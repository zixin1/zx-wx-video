package com.zx.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自心简易山寨版全局唯一ID
 */
public class ZxID {
    private ZxID(){}

    /*顺序数*/
    public static int temp=10000;


    public static String getID(){
        if(temp<99999){
            temp++;
        }else{
            temp=10000;
        }
        String date=new ZxID().getDate();
        String str="ZXID"+new ZxID().Num(date+temp);
        return str;
    }


    //获取时间
    private String getDate(){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        String da=dateFormat.format(date)+temp;
        return da;
    }


    /*替换数字*/
    public String Num(String str){
        String newStr="";
        char [] ch={'z','x','c','v','b','n','m','#','%','!'};
        for (int i=0;i<str.length();i++){
            int temp=Integer.parseInt(str.substring(i,i+1));
            newStr+=ch[temp];
        }
        return newStr;
    }

    //测试
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println(ZxID.getID());
        }

    }

}
