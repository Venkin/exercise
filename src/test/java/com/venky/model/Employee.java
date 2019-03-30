package com.venky.model;

/**
 * 员工
 *
 * @author Venkin
 * @date 2019/3/29
 **/
public class Employee extends Person {

    private String position;
    private int salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
