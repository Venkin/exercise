package com.venky.vip.day3.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 *
 * @author Venkin
 * @date 2019/3/19
 **/
public interface GpInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
