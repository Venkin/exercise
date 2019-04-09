package com.venky.vip.day6.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * 咕泡老师类
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public class Teacher implements Observer {

    private String name;

    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        GPer gPer = (GPer) o;

        Question question = (Question) arg;

        System.out.println("========================");

        System.out.println(name + "老师，您好，\n"
                + "您收到一个来自" + gPer.getName() + "的提问，希望您及时解答，内容如下："
                + question.getContent() + "提问者：" + question.getUsername());
    }
}
