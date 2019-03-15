package com.venky.vip.day2.hungry;

/**
 * 单例设计模式 饿汉式
 */
public class HungrySingleton {

    /**
     * 直接实例化单例
     */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    /**
     * 全局访问点
     *
     * @return
     */
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
