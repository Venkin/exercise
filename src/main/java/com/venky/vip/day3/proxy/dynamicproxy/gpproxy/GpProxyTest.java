package com.venky.vip.day3.proxy.dynamicproxy.gpproxy;

import com.venky.vip.day3.proxy.dynamicproxy.Lessee;
import com.venky.vip.day3.proxy.staticproxy.Person;

/**
 * 手写代理测试类
 *
 * @author Venkin
 * @date 2019/3/21
 **/
public class GpProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new GpAgency().getInstance(new Lessee());

        System.out.println(person.getClass());

        person.findFlat();
    }
}
