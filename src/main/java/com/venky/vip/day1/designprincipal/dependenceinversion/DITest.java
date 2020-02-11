package com.venky.vip.day1.designprincipal.dependenceinversion;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class DITest {

    public static void main(String[] args) {

        Student student = new Student();

        /*student.studyPython();

        student.studyJava();*/

        PythonCourse course = new PythonCourse();

        student.study(course);

    }
}
