package com.venky;

import java.util.concurrent.TimeUnit;

public class InterruptDemo {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {

            while (true) {
//                boolean ii = Thread.currentThread().isInterrupted();
//                if (ii) {
////                i++;
//                    System.out.println("before：" + ii);
//                    Thread.interrupted();//对当前的线程表示进行复位
//                    System.out.println("after：" + Thread.currentThread().isInterrupted());
//                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    //抛出该异常，会将复位标识设置为false
                    e.printStackTrace();
                }

            }
//            System.out.println(i);
        }, "interruptDemo");


        thread.start();
        thread.join();

        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();//中断线程 设置复位标识为true
        TimeUnit.SECONDS.sleep(1);
        System.out.println(thread.isInterrupted());
    }
}
