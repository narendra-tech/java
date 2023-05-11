package com.haritech.service.May11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//1). expecting input only.
//2). expecting input and output.
//3). expecting output only.
//4). taking input and not returing output.
@FunctionalInterface
interface Inf{
    void display();
}

//streams.
public class NonFunInf {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("bananna");
        
        fruits.add("apple");
        fruits.add("jack");

        List<String> newFruits = new ArrayList<>();
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            newFruits.add(it.next().toUpperCase());
        }

        //streams.
//        Set<String> uniqueFruits = fruits.stream().map((String fruit) -> fruit.toUpperCase()).collect(Collectors.toSet());
        Set<String> uniqueFruits = fruits.stream().map(f -> {
            System.out.println("fruit is::"+f);
            return f.toUpperCase();
        }).sorted((f1,f2) -> f1.compareTo(f2)).collect(Collectors.toSet());
        fruits.stream().map(String::toUpperCase).collect(Collectors.toSet());
    }

}
