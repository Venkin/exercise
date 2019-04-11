package com.venky.vip.day6.observer.gperadvice.guava;

import com.google.common.eventbus.EventBus;
import com.venky.vip.day6.observer.gperadvice.Question;

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
        GuavaTeacher mic = new GuavaTeacher("Mic");
        eventBus.register(guavaTeacher);
        eventBus.register(mic);

        Question question = new Question();

        question.setUsername("akuan");
        question.setContent("我要上天咯");
        question.setAsker("咕泡学院社交圈");

        eventBus.post(question);
    }
}
