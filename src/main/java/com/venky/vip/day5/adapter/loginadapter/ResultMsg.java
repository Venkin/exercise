package com.venky.vip.day5.adapter.loginadapter;

/**
 * 返回结果
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;

    public ResultMsg() {
    }

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
}
