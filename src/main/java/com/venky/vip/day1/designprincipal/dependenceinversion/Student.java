package com.venky.vip.day1.designprincipal.dependenceinversion;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class Student {


    public void study(Course course){
        course.study();
    }

    /*public void studyPython(){
        System.out.println("学习python课程");
    }

    public void studyJava(){
        System.out.println("学习java课程");
    }*/



}
