package com.venky.vip.day1.designprincipal.openclose;

/**
 * python 课程
 *
 * @author huwk
 * @date 2020/1/12
 **/
public class PythonCource implements Course {

    private Integer no;

    private String name;

    private Double price;

    public PythonCource(Integer no,String name,Double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getNo() {
        return this.no;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
