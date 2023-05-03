package com.haritech.service.May2;

import java.util.*;

//Maps => HashMap, LinkedHashMap, TreeMap.
public class Maps {
    //Map => key, value pairs.

    public static void main(String args[]){
        HashMap hm = new HashMap(); // not recommended.

        HashMap<String, String> hms = new HashMap<>();//recommeded.
        Map<String, List> data = new HashMap<>();

        List<Integer> even = new ArrayList<>();
        even.add(2);
        even.add(4);
        even.add(6);
        data.put("even", even);

        List<Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        data.put("odd", odd);

        //saving the data.
        hms.put("name1", "Narendra");
        hms.put("age", "20");
        hms.put("phone","1234");
//        hms.put("address","ap");

        Map<String, String> newHm = new HashMap<>();
        newHm.put("name2", "kohli");
        newHm.put("address", "delhi");
        hms.putAll(newHm);
        System.out.println("data is::"+hms);

        //get the data.
        System.out.println(hms.get("name"));
        System.out.println(hms.getOrDefault("address", "blr"));

        //iterate the data.
        Set<Map.Entry<String,String>> ens = hms.entrySet();
        Iterator<Map.Entry<String,String>> ie= ens.iterator();
        while (ie.hasNext()){
            Map.Entry<String,String> entry = ie.next();
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
            System.out.println("===");
        }

        System.out.println(hms.size());
        Set<String> keySet = hms.keySet();
        keySet.contains("name");


        //remove the data.
        hms.remove("name", "kohli");
        hms.remove("address");


    }
}
