package com.venky.vip.day4.delegate;

/**
 * 委派模式测试
 *
 * @author Venkin
 * @date 2019/3/24
 **/
public class DelegateTest {

    public static void main(String[] args) {


        /**
         * 1、客户请求（老板）、委派者（项目经理）、被委派者（员工）
         *
         * 2、委派者要持有被委派者的引用
         *
         * 3、代理模式关注的是过程，委派模式注重的是结果
         *
         * 4、策略模式注重的是可扩展（外部扩展），委派模式注重的是内部的灵活和复用。
         *
         * 5、委派的核心：就是分发、调度、派遣
         *
         * 6、委派模式是静态代理和策略模式的一种特殊组合。
         *
         */
        new Boss().command("登录",new ProjectManager());
    }
}
