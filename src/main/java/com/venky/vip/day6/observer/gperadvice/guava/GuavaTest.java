package com.venky.vip.day6.observer.gperadvice.guava;

import com.google.common.eventbus.EventBus;

/**
 * 测试
 *
 * @author Venkin
 * @date 2019/4/11
 **/
public class GuavaTest {

    public static void main(String[] args) {


        EventBus eventBus = new EventBus();

        GuavaTeacher guavaTeacher = new GuavaTeacher("Venky");
        eventBus.register(guavaTeacher);

        eventBus.post("");
    }
}
