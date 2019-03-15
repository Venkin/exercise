package com.venky.vip.day2.lazy;

import java.lang.reflect.Constructor;

/**
 * 懒汉式测试类
 */
public class LazySingletonTest {

    public static void main(String[] args) {

        /**
         * 测试在多线程下，简单懒汉式单例的线程安全问题
         */
        Thread t1 = new Thread(() -> {
//            LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
            LazyInnerClassSimpleton simpleSingleton = LazyInnerClassSimpleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
        });
        Thread t2 = new Thread(()->{
//            LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
            LazyInnerClassSimpleton simpleSingleton = LazyInnerClassSimpleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
        });

//        t1.start();
//        t2.start();

        try {
            // 破坏单例的情况
            Class<?> clazz = LazyInnerClassSimpleton.class;

            // 获取私有构造方法
            Constructor c = clazz.getDeclaredConstructor(null);

            // 强制访问
            c.setAccessible(true);

            // 暴力初始化
            // 问题是为什么仅仅调用一次反射构造方法，就会抛出异常？
            // 因为在初始化一个对象后，会首先初始化静态变量，然后在初始化构造方法
            Object o1 = c.newInstance();

//            Object o2 = c.newInstance();

//            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
