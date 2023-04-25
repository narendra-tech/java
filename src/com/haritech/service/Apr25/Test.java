package com.haritech.service.Apr25;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]){
        List<String> l = new ArrayList<>();
        l.add("orange");
        l.add("apple");
        l.add("watermelon");
        System.out.println("index::"+l.indexOf("grapes"));
        System.out.println("index::"+l.indexOf("apple"));

        System.out.println("contains::"+l.contains("grapes"));
        System.out.println("contains::"+l.contains("apple"));

        List l2 = new ArrayList<String>();
        l2.add("orange");
        l2.add("apples");

        System.out.println("contains all::"+l.containsAll(l2));
    }
}
