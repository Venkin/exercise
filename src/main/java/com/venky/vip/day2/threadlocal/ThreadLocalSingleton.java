package com.venky.vip.day2.threadlocal;

/**
 * 线程间单例
 * 能保证同一个线程下只有一个实例
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
