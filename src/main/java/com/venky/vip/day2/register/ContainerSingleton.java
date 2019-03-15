package com.venky.vip.day2.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例 也就是ioc
 * 适用于创建实例非常多的情况
 * 但是是非线程安全的，这个如何理解？
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
