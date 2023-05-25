package com.haritech.service.May25;

public class Threads extends Thread {
    //Thread => 2 ways to create a thread

    @Override
    public void run(){
        System.out.println("this is run method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("completes run method");
    }

    public void test(){
        System.out.println("this is test method");
    }

    public static void main(String args[]) throws InterruptedException {
        Threads th = new Threads();
        th.start();
//        th.test();
        th.join();
        System.out.println("main thread");
    }

}
