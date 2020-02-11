package com.venky.vip.day1.designprincipal.dependenceinversion;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class JavaCourse implements Course {
    @Override
    public void study() {
        System.out.println("学习Java课程");
    }
}
