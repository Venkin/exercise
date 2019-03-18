package com.venky.vip.day3.proxy.staticproxy;

/**
 * 静态代理测试类
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class StaticProxyTest {

    public static void main(String[] args) {

        Tenant tenant = new Tenant();
        Agency agency = new Agency(tenant);

        agency.find();
    }
}
