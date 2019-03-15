package com.venky.vip.day2.threadlocal;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance()));
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance()));

        t1.start();
        t2.start();


    }
}
