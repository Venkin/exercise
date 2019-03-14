package com.venky.request;

import java.util.concurrent.LinkedBlockingQueue;

public class SaveProcessor extends Thread implements RequestProcessor {

    LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();

    @Override
    public void run() {
        while (true){
            System.out.println("save");
            try {
                Request request = requests.take();
                System.out.println("begin save request:" + request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void processRequest(Request request) {
        requests.add(request);
    }
}
