package com.haritech.service.May3;

import java.util.LinkedHashMap;

public class LHMap {

    public static void main(String args[]){
        //Linked hashmap
        LinkedHashMap<String, String> lh = new LinkedHashMap<>();
        lh.put("name", "modi");
        lh.put("age", "50");
        lh.put("address", "gujarat");



        System.out.println("lh is::"+lh);
        System.out.println("has value::"+lh.containsValue("gujarat"));
        lh.forEach((key, value) -> System.out.println("key is::"+key+":: value is::"+value));
        System.out.println("contains key::"+lh.containsKey("address"));
        lh.remove("age");
        lh.put("age", "60");
        System.out.println("lh is::"+lh);

    }
}
