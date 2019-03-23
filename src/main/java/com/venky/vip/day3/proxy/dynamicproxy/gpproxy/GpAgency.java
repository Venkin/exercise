package com.venky.vip.day3.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * 房屋中介人
 *
 * @author Venkin
 * @date 2019/3/21
 **/
public class GpAgency implements GpInvocationHandler {

    // 被代理对象
    private Object target;

    public Object getInstance(Object target) {

        this.target = target;
        Class<?> clazz = target.getClass();
        clazz.getClassLoader();
        return GpProxy.newProxyInstance(new GpClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object obj = method.invoke(this.target,args);
        return obj;
    }
}
