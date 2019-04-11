package com.venky.vip.day6.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.venky.vip.day6.observer.gperadvice.Question;

/**
 * 监听事件类
 *
 * @author Venkin
 * @date 2019/4/9
 **/
public class GuavaEvent {

    @Subscribe
    public void subscribe( Question question) {
        // 逻辑d代码
        System.out.println("执行subscribe方法，传入的参数为 "  + question.getUsername());

    }
}
