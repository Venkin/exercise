package com.venky.vip.day3.proxy.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 切换数据源静态代理
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class OrderServiceStaticProxy /*implements IOrderService*/ {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    /*@Override*/
    public int createOrder(Order order) {
        before();
        long time = order.getCreateTime();
        int dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 1;
    }

    private void after() {
        System.out.println("proxy before method");
    }

    private void before() {
        System.out.println("proxy after method");
    }

}
