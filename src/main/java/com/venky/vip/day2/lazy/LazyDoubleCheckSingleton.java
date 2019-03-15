package com.venky.vip.day2.lazy;

/**
 * 双重检查锁
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    /**
     * 统一入口
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){

        if (lazyDoubleCheckSingleton == null) {

            //这里的LazyDoubleCheckSingleton.class和this是否有区别
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }

            }

        }
        return lazyDoubleCheckSingleton;
    }
}
