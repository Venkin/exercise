package com.venky.vip.day3.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib中介
 *
 * @author Venkin
 * @date 2019/3/23
 **/
public class CglibAgency implements MethodInterceptor {


    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();

        // 设置谁为即将生成新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        // 一些业务增强方法。。。

        Object obj = methodProxy.invokeSuper(o,objects);

        // 一些其他业务方法
        return obj;
    }
}
