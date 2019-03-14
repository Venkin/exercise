package com.venky.request;

public class Request {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "request{" +
                "name='" + name + '\'' +
                '}';
    }
}
