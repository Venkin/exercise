package com.venky.vip.day1.designprincipal.dependenceinversion;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class PythonCourse implements Course {
    @Override
    public void study() {
        System.out.println("在学习python课程");
    }
}
