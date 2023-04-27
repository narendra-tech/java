package com.haritech.service.Apr26;

import java.util.PriorityQueue;

public class priorityQ {

    public static void main(String args[]){
        //Stack => LIFO ()
        //Queue => FIFO (priority queue, dqueue(double ended queue))
        //CURD => operations
        PriorityQueue<String> animals = new PriorityQueue<>();
        animals.add("Zebra");
        animals.add("Elephant");
        animals.add("Monkey");
        animals.add("Cow");
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Balakrishna");
        names.add("Mohanbabu");

        animals.addAll(names);

        System.out.println("animals is::"+animals);

//        System.out.println("element is::"+animals.poll());
//        System.out.println("size is::"+animals.size());
//
//        System.out.println("element is::"+animals.poll());
//        System.out.println("animals is::"+animals);
        System.out.println("size is::"+animals.size());
        int size = animals.size();
        for(int i =0;i<size;i++){
            System.out.println("element is::"+animals.remove());
        }

    }
}
