package com.venky.vip.day3.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK的方式实现动态代理
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class JdkAgency implements InvocationHandler {

    /**
     * 被代理的对象，这里可以理解为Tenant，租户
     */
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;

        // 预定优于配置
        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target);
        after();
        return obj;
    }

    private void after() {
        System.out.println("proxy before method");
    }

    private void before() {
        System.out.println("proxy after method");
    }

}
