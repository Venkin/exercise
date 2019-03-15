package com.venky.vip.day2.hungry;

/**
 * 静态代码块的方式
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    /**
     * 全局访问点
     *
     * @return
     */
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
