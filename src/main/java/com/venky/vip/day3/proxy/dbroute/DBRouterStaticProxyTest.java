package com.venky.vip.day3.proxy.dbroute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态数据库路由测试
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class DBRouterStaticProxyTest {

    public static void main(String[] args) throws ParseException {

        Order order = new Order();

        Date now = new Date();
        order.setCreateTime(now.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2017/2/1");
        order.setCreateTime(date.getTime());

        /* 是让OrderServiceStaticProxy实现了IOrderService接口 */
        /*IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());

        orderService.createOrder(order);*/

        /* 也可以换成这种形式写，不一定OrderServiceStaticProxy要继承 IOrderService */
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy(new OrderServiceImpl());
        orderServiceStaticProxy.createOrder(order);
    }
}
