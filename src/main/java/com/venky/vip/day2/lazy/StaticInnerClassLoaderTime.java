package com.venky.vip.day2.lazy;

/**
 * 测试静态内部类的加载时间
 */
public class StaticInnerClassLoaderTime {
    public static class Inner {
        static {
            System.out.println("TestInner Static!");
        }
        public final static StaticInnerClassLoaderTime testInstance =
                new StaticInnerClassLoaderTime(3);
    }

    public static StaticInnerClassLoaderTime getInstance() {
        return Inner.testInstance;
    }

    public StaticInnerClassLoaderTime(int i) {
        System.out.println("Test " + i + " Construct! ");
    }

    // 类静态属性
    public static StaticInnerClassLoaderTime testOut =
            new StaticInnerClassLoaderTime(1);

    public static int value = 3;
    // 类静态块
    static {
        System.out.println("Test Static" + value);
    }

    public static void main(String args[]) {
        StaticInnerClassLoaderTime t = new StaticInnerClassLoaderTime(2);
        StaticInnerClassLoaderTime.getInstance();
    }
}
