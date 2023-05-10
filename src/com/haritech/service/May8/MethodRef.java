package com.haritech.service.May8;

import java.util.*;
import java.util.stream.Collectors;

class Fruit{
    String name;
    public Fruit(String name){
        this.name = name;
    }
}

class SortFruits implements Comparator<Fruit>{

    @Override
    public int compare(Fruit f1, Fruit f2) {
        return f1.name.compareTo(f2.name);
    }
}

public class MethodRef {
    //:: operator (for method references)
    //1).static method reference
    //2).constructor reference
    //3).instance method reference(same type, arbitary type).
    public static void main(String args[]){

        List<String> l = new ArrayList<>();
        l.add("Orange");
        l.add("Bananna");
        l.add("Apple");
        //static method refrence.
        l.forEach(MethodRef::printFruits);

        List<Fruit> ls = new ArrayList<>();
        for(int i=0;i<l.size();i++){
            ls.add(new Fruit(l.get(i)));
        }

        //constructor reference.
        List<Fruit> fruits =  l.stream().map(Fruit::new).collect(Collectors.toList());
        System.out.println("fruits is::"+ fruits);

        //instance method reference same type
        SortFruits sf = new SortFruits();
        List<Fruit> sortedFruits = fruits.stream().sorted(sf::compare)
                .collect(Collectors.toList());
        System.out.println(sortedFruits);

        //instance method reference arbiraty type
        //"Oragne".compareTo();
        List<String> sortFruits = l.stream().sorted(String::compareTo).collect(Collectors.toList());

        Map<String, Integer> m = new HashMap<>();
        m.put("Orange", 100);
        m.put("Bananna", 35);
        m.put("apple", 200);
        m.forEach(MethodRef::formattFruits);


    }

    public static void printFruits(String fruit){
        System.out.println(fruit);
    }

    public static void formattFruits(String fruit, int cost){
        System.out.println("frutis::"+fruit+":: cost::"+cost);
    }
}
