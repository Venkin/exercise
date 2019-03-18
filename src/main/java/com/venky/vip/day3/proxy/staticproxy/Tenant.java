package com.venky.vip.day3.proxy.staticproxy;

/**
 * 租户 /'tɛnənt/
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class Tenant implements Person{

    @Override
    public void findFlat() {

        //由于租户手上没有房源，无法联系到房主，只能通过一些第三方获取租赁信息
        System.out.println("找房子，需要三室一厅，精装修的，南北通透的");

    }
}
