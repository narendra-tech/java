package com.haritech.service.May26;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Input{
    int id;
    String name;
    String password;
    Input(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class Test {
    //ThreadPool
    //Thread lifecycle.
    public static void main(String args[]){
        Input inp = new Input(1,"kohli","abcd");

        Runnable task = () -> {
            System.out.println("task start::"+ inp.password);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task complete");
        };

        Callable<String> task2 = () -> {
            System.out.println("task2 start::"+inp.name);
            Thread.sleep(1000);
            return "task2";
        };

        Callable<String> task3 = () -> {
            System.out.println("task3 start");
            Thread.sleep(100000);
            return "task3";
        };

        Callable<String> task4 = () -> {
            System.out.println("task4 start");
            Thread.sleep(1000);
            return "400";
        };
        ExecutorService exs = Executors.newFixedThreadPool(5);
////        ExecutorService exs = Executors.newSingleThreadExecutor();
//        exs.execute(task);
//        System.out.println("this is main thread");
//        exs.execute(task);
//        exs.shutdown();


//        ExecutorService exs = Executors.newSingleThreadExecutor();
//        Future<String> future = exs.submit(task2);
//        try {
//            String res = future.get();
//            System.out.println("result is::"+res);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        List<Callable<String>> callableList = new ArrayList<>();
        callableList.add(task2);
        callableList.add(task3);
        callableList.add(task4);
        try {
            List<Future<String>> futures = exs.invokeAll(callableList);
            for(Future<String> fut : futures){
                System.out.println("result is::"+fut.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        exs.shutdown();
    }
}
