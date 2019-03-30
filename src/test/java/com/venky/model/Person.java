package com.venky.model;

/**
 * 人类
 *
 * @author Venkin
 * @date 2019/3/29
 **/
public class Person {

    protected String name;
    protected int age;
    protected int gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
