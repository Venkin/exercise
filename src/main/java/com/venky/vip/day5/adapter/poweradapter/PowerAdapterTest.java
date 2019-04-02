package com.venky.vip.day5.adapter.poweradapter;

/**
 * 电源适配测试类
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class PowerAdapterTest {

    public static void main(String[] args) {

        DC5 dc5 = new PowerAdapter(new AC220());

        dc5.outputDC5();
    }
}
