package com.haritech.service.May3;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

//Tree map. => {key: value,....} => sorting order based on key
public class TMap {
    public static void main(String args[]){

        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("name", "modi");
        tm.put("age", "50");
        tm.put("address", "gujarat");
        System.out.println("tm is::"+tm);
        tm.put("address", "delhi");

        //celing => 10,10.12,10.35,10.49
        //10.35 => celing(10.49) floor(10.12)
        NavigableSet<String> nv = tm.descendingKeySet();
        Iterator<String> dit = nv.descendingIterator();

        while(dit.hasNext()){
            System.out.println("dit key::"+dit.next());
        }

        Iterator<String> it = nv.iterator();
        while(it.hasNext()){
            System.out.println("it key::"+it.next());
        }


        tm.ceilingKey("age");// name
        tm.ceilingEntry("age"); // entire entry ("name", "modi")
    }
}
