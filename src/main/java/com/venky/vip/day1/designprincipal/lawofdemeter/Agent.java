package com.venky.vip.day1.designprincipal.lawofdemeter;

/**
 * 经纪人
 *
 * @author huwk
 * @date 2020/2/1
 **/
public class Agent {

    private Star star;

    private Fans fans;

    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 见粉丝
     */
    public void meeting(){
        System.out.println("安排粉丝" + fans.getName() + "与明星" + star.getName() + "见面");
    }

    /**
     * 谈业务
     */
    public void business(){
        System.out.println("安排公司" + company.getName() + "与明星" + star.getName() + "洽谈业务");
    }
}
