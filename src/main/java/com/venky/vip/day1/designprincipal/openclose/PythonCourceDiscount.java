package com.venky.vip.day1.designprincipal.openclose;

/**
 * 打折python课程
 *
 * @author huwk
 * @date 2020/1/12
 **/
public class PythonCourceDiscount extends PythonCource {

    public PythonCourceDiscount(Integer no, String name, Double price) {
        super(no, name, price);
    }

    public Double getDiscountPrice() {
        return  super.getPrice() * 0.8;
    }
    @Override
    public Double getPrice() {
        return super.getPrice();
    }
}
