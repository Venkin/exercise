package com.venky;

import com.venky.model.Employee;
import com.venky.model.Person;
import com.venky.model.Student;

/**
 * 测试类
 *
 * @author Venkin
 * @date 2019/3/29
 **/
public class MyTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.setGrade("2");
        student.setSno("22222");
        push(student);

        push(new Employee());

    }

    private static void push(Person person){

        if (person != null) {
            if (person instanceof Employee) {
                System.out.println(((Employee) person).getPosition());
            } else if (person instanceof Student){
                System.out.println(((Student) person).getGrade());
            }
        }
    }
}
