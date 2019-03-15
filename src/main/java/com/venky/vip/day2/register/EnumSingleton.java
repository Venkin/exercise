package com.venky.vip.day2.register;

/**
 * 枚举登记
 */
public enum  EnumSingleton {

    SINGLETON;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return SINGLETON;
    }
}
