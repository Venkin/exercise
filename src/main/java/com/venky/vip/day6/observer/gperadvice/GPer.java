package com.venky.vip.day6.observer.gperadvice;

import java.util.Observable;

/**
 * 咕泡学员
 * 被观察者
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public class GPer extends Observable {

    private String name = "GPer生态圈";

    private static GPer gPer = null;

    private GPer(){}

    public static GPer getInstance(){
        // 这里不考虑并发的情况
        if (null == gPer) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUsername() + "在" + this.name + "提交了一个问题。");

        setChanged();

        notifyObservers(question);
    }
}
