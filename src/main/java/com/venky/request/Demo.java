package com.venky.request;

public class Demo {

    PrintProcessor printProcessor;

    public Demo(){

        SaveProcessor saveProcessor = new SaveProcessor();
        saveProcessor.start();

        printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();

    }

    private void doTest(Request request){
        printProcessor.processRequest(request);
    }

    public static void main(String[] args) {
        Request request = new Request();

        request.setName("hu");

        new Demo().doTest(request);
    }
}
