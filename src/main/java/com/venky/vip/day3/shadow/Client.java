package com.venky.vip.day3.shadow;

/**
 * 调用客户端
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class Client {

    /*private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }*/

    public Prototype startClone(Prototype concretePrototype) {
        return concretePrototype.clone();
    }

}
