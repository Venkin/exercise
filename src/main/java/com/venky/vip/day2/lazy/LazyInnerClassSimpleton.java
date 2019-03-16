package com.venky.vip.day2.lazy;

/**
 * 静态内部内单例实现，被称为史上最牛逼的单例
 * 加上防止反射破坏单例的判断后，是一个不错的单例实现方法
 */
public class LazyInnerClassSimpleton {

    private LazyInnerClassSimpleton() {
        // 问题是为什么仅仅调用一次反射构造方法，就会抛出异常？
        // 因为在初始化一个对象后，会首先初始化静态变量，然后在初始化构造方法
        // 这时候静态变量已经初始化了，所有就不会砸出现异常了。
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
        System.out.println("创建类");

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
