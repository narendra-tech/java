package com.haritech.service.May25;

class Test implements Runnable{
    @Override
    public void run(){
        System.out.println("runnable ex");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of runnable");
    }
}

public class RunnableEx {

    public static void main(String args[]){
        Runnable rn = () -> {
            System.out.println("runnable ex");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end of runnable");
        };
        Thread th = new Thread(new Test());
        th.start();
        Thread th1 = new Thread(new Test());
        th1.start();
    }
}

//what is deadlock, get the example for the deadlock.