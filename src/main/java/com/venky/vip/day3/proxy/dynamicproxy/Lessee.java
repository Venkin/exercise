package com.venky.vip.day3.proxy.dynamicproxy;

import com.venky.vip.day3.proxy.staticproxy.Person;

/**
 * 承租人 /lɛ'si/
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class Lessee implements Person {

    @Override
    public void findFlat() {

        System.out.println("需要一个1000平米的毛坯房，有泳池，有健身房作为办公室用");

    }
}
