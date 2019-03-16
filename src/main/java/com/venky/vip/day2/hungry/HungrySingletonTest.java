package com.venky.vip.day2.hungry;

/**
 * 饿汉式单例测试类
 *
 * 适用于单例比较少的情况，加载的时候立即初始化
 */
public class HungrySingletonTest {

    public static void main(String[] args) {

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        System.out.println(hungrySingleton);

        HungryStaticSingleton hungryStaticSingleton = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton);
    }
}
