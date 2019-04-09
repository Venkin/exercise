package com.venky.vip.day6.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 测试类
 *
 * @author Venkin
 * @date 2019/4/9
 **/
public class GuavaTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);

        eventBus.post("venky");

    }
}
