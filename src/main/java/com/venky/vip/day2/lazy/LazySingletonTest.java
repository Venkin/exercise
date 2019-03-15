package com.venky.vip.day2.lazy;

/**
 * 懒汉式测试类
 */
public class LazySingletonTest {

    public static void main(String[] args) {

        /**
         * 测试在多线程下，简单懒汉式单例的线程安全问题
         */
        Thread t1 = new Thread(() -> {
            LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
        });
        Thread t2 = new Thread(()->{
            LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
        });

        t1.start();
        t2.start();


    }
}
