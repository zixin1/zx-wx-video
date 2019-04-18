package com.zx.utils;


/**
 * 自定义响应数据结构
 * 200:表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 */
public class ZxJSONResult {
    //响应业务状态
    private Integer status;

    //响应信息
    private  String msg;

    //响应中的数据
    private Object data;

    //带数据成功响应
    public static ZxJSONResult ok(Object data){
        return new ZxJSONResult(data);
    }
    //不带数据成功响应
    public static ZxJSONResult ok(){
        return new ZxJSONResult();
    }

    //500自定义失败响应
    public static ZxJSONResult errorMsg(String msg){
        return new ZxJSONResult(msg);
    }
    //是否连接成功
    public Boolean isOK() {
        return this.status == 200;
    }


    public ZxJSONResult(Object data) {
        this.status = 200;
        this.msg = "success";
        this.data = data;
    }

    public ZxJSONResult(String msg) {
        this.status = 500;
        this.msg = msg;
    }
    public ZxJSONResult() {
        this.status = 200;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //测试
    public static void main(String[] args){
        ZxJSONResult zxJSONResult= ZxJSONResult.ok("456");
        System.out.println(zxJSONResult.status);
        System.out.println(zxJSONResult.msg);
        System.out.println(zxJSONResult.data);
    }
}
