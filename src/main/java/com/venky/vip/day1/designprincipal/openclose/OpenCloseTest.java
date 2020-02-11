package com.venky.vip.day1.designprincipal.openclose;

/**
 * @author huwk
 * @date 2020/1/12
 **/
public class OpenCloseTest {

    public static void main(String[] args) {

        PythonCource pythonCource = new PythonCource(1,"python",5600d);

        pythonCource.getPrice();


        PythonCourceDiscount pythonCourceDiscount = new PythonCourceDiscount(1,"python",5600d);
        pythonCourceDiscount.getDiscountPrice();




    }

}
