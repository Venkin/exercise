package com.venky.vip.day2.lazy;

/**
 * 静态内部内单例实现
 */
public class LazyInnerClassSimpleton {

    private LazyInnerClassSimpleton() {
    }

    public static LazyInnerClassSimpleton getInstance() {

        return LazyHolder.LAZY;
    }

    /**
     * 静态内中默认是不会加载内部变量的
     */
    private static class LazyHolder {

        private static final LazyInnerClassSimpleton LAZY = new LazyInnerClassSimpleton();

    }


}
