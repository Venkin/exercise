package com.venky.vip.day3.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * cglib动态代理测试
 *
 * @author Venkin
 * @date 2019/3/23
 **/
public class CglibProxyTest {

    public static void main(String[] args) {


        // 利用cglib的代理类可以将内存中的class写入磁盘，需要先写这句代码后，再加载类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_class/");

        Lodger lodger = (Lodger) new CglibAgency().getInstance(Lodger.class);

        lodger.findPlat();

    }
}
