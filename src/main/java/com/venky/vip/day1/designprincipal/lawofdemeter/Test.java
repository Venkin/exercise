package com.venky.vip.day1.designprincipal.lawofdemeter;

/**
 * 测试
 *
 * @author huwk
 * @date 2020/2/1
 **/
public class Test {
    public static void main(String[] args) {

        Star star = new Star();
        star.setName("周杰伦");

        Fans fans = new Fans();
        fans.setName("小明");

        Company company = new Company();
        company.setName("滚石唱片");


        Agent agent = new Agent();
        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);

        agent.meeting();
        agent.business();

    }
}
