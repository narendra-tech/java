package com.haritech.service.Apr21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//List, Set, Map => user defined, or builtin types
/*
*   Iterable
*     Collection
*       List
*           ArrayList => indexing, duplicate elements, dynamically grow/shrink, type(homogenous elements)
*           LinkedList
*
*   Collections
*   Object => super class for all types of objects.
* */
public class CollectionsF {

    public static void main(String args[]){
//        ArrayList<String> players = new ArrayList<String>(); // => it will store like as Object
//        ArrayList players = new ArrayList<String>();
//        ArrayList<String> players = new ArrayList();

        List<String> players = new ArrayList();
        players.add("kohli");
        players.add("dhoni");
        players.add("umesh");
        players.add(String.valueOf(100));
//        players.add(10.123);
        //CURD => CREATE, UPDATE, READ, DELETE
        //static binding, dynamic binding.
        String s = "hello world";
        System.out.println(s.toUpperCase());
        System.out.println(players.get(0).toUpperCase());



    }
}
