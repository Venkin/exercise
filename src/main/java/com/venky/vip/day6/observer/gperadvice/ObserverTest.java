package com.venky.vip.day6.observer.gperadvice;

/**
 * 观察者测试类
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public class ObserverTest {

    public static void main(String[] args) {

        GPer gPer = GPer.getInstance();

        Teacher venky = new Teacher("Venky");

        Teacher venkin = new Teacher("Venkin");

        gPer.addObserver(venky);
        gPer.addObserver(venkin);

        // 提问
        Question question = new Question();
        question.setUsername("阿宽");
        question.setContent("观察者模式要上天啊！");

        gPer.publishQuestion(question);



    }
}
