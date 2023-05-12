package com.haritech.service.May12;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;


public class FuncPack {

    void display(){

    }
    public static void main(String args[]){
        List<String> fruits = Arrays.asList("organe","apple","banna","watermileon");
        //Function => taking input and returning output.
        Function<String, String> func = (name) -> name.toUpperCase();
        System.out.println(func.apply("dhoni"));

        Function<String, String> func1 = String::toUpperCase;
        System.out.println(func.apply("virat"));

        BiFunction<Integer, Integer, Integer> sum = (a,b) -> {
            System.out.println("this is byfunction");
            return a + b;
        };
        System.out.println(sum.apply(10,20));
        fruits.stream().map(func).collect(Collectors.toSet());
        fruits.stream().map(String::toUpperCase);
        fruits.stream().map(name -> name.toUpperCase());

        //Consumer => taking input not returning output.
        Consumer<String> cons = (name) -> System.out.println("my name is::"+name);
        cons.accept("Dhoni");

        //forEach.
        fruits.forEach(cons);
        fruits.forEach((fruit) -> System.out.println("my name is::"+fruit));

        //Predicate => taking input not returning boolean output.
        Predicate<Integer> pred = (age) -> age > 75;
        System.out.println(pred.test(100));
        System.out.println(pred.test(10));

        List<Integer> marks = Arrays.asList(30,35,70,90,25,55,80,85);
        System.out.println("merit marks::"+marks.stream().filter(pred).collect(Collectors.toList()));

        //Supplier => not taking input returning output.
        Supplier<Long> date = () -> {
            return new Date().getTime();
        };
        System.out.println("date is::"+date.get());





    }
}
