package com.venky.vip.day1.designprincipal.compositeaggregatereuse;

/**
 * dao层
 *
 * @author huwk
 * @date 2020/2/2
 **/
public class BaseDao {

    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public void add() {
        String conn = connection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}






