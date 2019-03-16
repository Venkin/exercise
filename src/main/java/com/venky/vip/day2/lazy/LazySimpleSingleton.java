package com.venky.vip.day2.lazy;

/**
 * 懒汉式的简单实例
 *
 * 非线程安全
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazySimpleSingleton = null;

    /**
     * 唯一创建入口
     *
     * @return
     */
    public static LazySimpleSingleton getInstance(){

        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
