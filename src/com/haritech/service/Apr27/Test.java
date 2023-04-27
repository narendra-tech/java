package com.haritech.service.Apr27;

import java.util.*;

class Animal{
    void displayFruits(String[] fruits){
        //logic.
    }
}
//set => hashset, linked hashset, Tree set
public class Test {

    //internal implementation. => depends on hashcode
    public static void main(String args[]){
        Set<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("mango");
        fruits.add("Grapes");

        System.out.println(fruits.contains("Pineapple"));
        List l = new ArrayList<String>();
        l.add("Mango");
        l.add("Butterfruit");
        l.add("pomogrenete");

        fruits.addAll(l);
        System.out.println(fruits.containsAll(l));
//        fruits.removeAll(l);
        fruits.retainAll(l);

        String[] s = new String[0]; //array
        String s2 = new String("Hello world");
        String[] arr = fruits.toArray(s);
        System.out.println("s::"+s);
        System.out.println("arr::"+arr[0]);
        System.out.println(fruits);
        Animal a = new Animal();
        String [] newFruits = new String[fruits.size()];
        Iterator<String> it = fruits.iterator();
        int pos = 0;
        while (it.hasNext()){
            String fruit = it.next();
            newFruits[pos] = fruit;
            pos++;
        }
        a.displayFruits(arr);
        System.out.println("size of set is::"+fruits.size());

    }
}
