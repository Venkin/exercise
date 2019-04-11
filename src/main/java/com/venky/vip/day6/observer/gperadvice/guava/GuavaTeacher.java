package com.venky.vip.day6.observer.gperadvice.guava;

import com.venky.vip.day6.observer.gperadvice.GPer;
import com.venky.vip.day6.observer.gperadvice.Question;

/**
 * guava版本老师
 *
 * @author Venkin
 * @date 2019/4/11
 **/
public class GuavaTeacher {

    private String name;

    public GuavaTeacher(String name){
        this.name = name;
    }

    public void update(Object o, Object arg) {

        GPer gPer = (GPer) o;

        Question question = (Question) arg;

        System.out.println("========================");

        System.out.println(name + "老师，您好，\n"
                + "您收到一个来自" + gPer.getName() + "的提问，希望您及时解答，内容如下："
                + question.getContent() + "提问者：" + question.getUsername());
    }
}
