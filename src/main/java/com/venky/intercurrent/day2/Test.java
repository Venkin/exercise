package com.venky.intercurrent.day2;

public class Test {

    private static volatile Test instance = null;

    public static Test getInstance(){

        if (instance == null){
            instance = new Test();
        }

        return instance;
    }


}
