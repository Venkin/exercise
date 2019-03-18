package com.venky.vip.day3.proxy.staticproxy;

/**
 * 代理人
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class Agency {

    private Tenant tenant;

    public Agency(Tenant tenant) {
        this.tenant = tenant;
    }

    public void find() {
        before();
        tenant.findFlat();
        after();
    }

    private void before() {
        System.out.println("调取房源信息");
    }

    private void after() {
        System.out.println("签合同收租金");
    }


}
