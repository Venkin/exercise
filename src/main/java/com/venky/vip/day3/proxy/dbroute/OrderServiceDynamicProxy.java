package com.venky.vip.day3.proxy.dbroute;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 切换数据源动态代理
 *
 * @author Venkin
 * @date 2019/3/18
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object target;

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    public Object getInstance(Object target) {
        this.target = target;

        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before(args[0]);
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }
    private void after() {
        System.out.println("proxy before method");
    }

    private void before(Object args) {

        System.out.println("proxy after method");

        // 预定优于配置
        try {
            // 反射获取getCreateTime 方法
            long time = (Long) args.getClass().getMethod("getCreateTime").invoke(args);
            int dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntry.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
