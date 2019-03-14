package com.venky.intercurrent.day2;

public class Demo {
    volatile int i;

    public void incr(){
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        new Demo().incr();
    }
}
