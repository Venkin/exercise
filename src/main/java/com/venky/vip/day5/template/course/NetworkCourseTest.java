package com.venky.vip.day5.template.course;

/**
 * 网络课程测试类
 *
 * @author Venkin
 * @date 2019/4/1
 **/
public class NetworkCourseTest {

    public static void main(String[] args) {

        System.out.println("JAVA架构师课程");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println();
        System.out.println("大数据课程");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
