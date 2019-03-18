package com.venky.vip.day3.proxy.dbroute.dynamic;

import com.venky.vip.day3.proxy.dbroute.IOrderService;
import com.venky.vip.day3.proxy.dbroute.Order;
import com.venky.vip.day3.proxy.dbroute.OrderServiceDynamicProxy;
import com.venky.vip.day3.proxy.dbroute.OrderServiceImpl;

import java.util.Date;

/**
 * orderService 动态代理测试
 *
 * @author Venkin
 * @date 2019/3/18
 **/
public class OrderServiceDynamicProxyTest {

    public static void main(String[] args) {

        IOrderService orderService =
                (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());

        Order order = new Order();
        order.setCreateTime(new Date().getTime());


        orderService.createOrder(order);
    }
}
