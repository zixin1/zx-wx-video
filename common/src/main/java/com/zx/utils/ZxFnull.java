package com.zx.utils;

/**
 * 判断是否为空null或""
 */
public class ZxFnull {
    public static boolean Fnull(Object obj){
        if(obj==null){
            return false;
        }
        if (obj==""){
            return false;
        }
        return true;
    }

    /**
     * 测试
     */
    public static void main(String[] args){
        if(ZxFnull.Fnull("1")){
            System.out.println("不为空");
        }else {
            System.out.println("为空");
        }
    }
}
