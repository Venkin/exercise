package com.venky.vip.day4.delegate;

/**
 * 员工B
 *
 * @author Venkin
 * @date 2019/3/24
 **/
public class EmployeeB implements IEmployee {

    @Override
    public void work(String command) {

        System.out.println("我是员工B，我现在开始干" + command +"工作");

    }
}
