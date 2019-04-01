package com.venky.vip.day5.template.jdbc;

import com.venky.vip.day5.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * 测试
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class MemberDaoTest {

    public static void main(String[] args) {

        MemberDao memberDao = new MemberDao(null);

        List<?> result = memberDao.selectAll();

        System.out.println(result);
    }



}
