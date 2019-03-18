package com.venky.vip.day3.proxy.dbroute;

/**
 * 定单持久层类
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class OrderDao {


    public int insert(Order order) {
        System.out.println("OrderDao 插入order成功");
        return 1;
    }



}
