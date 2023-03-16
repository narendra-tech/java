package com.haritech.service.Mar14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Converter {
    public static void main(String args[]){
        String s = "narendra.abburi@perfios.com";
        Set<String> to = new HashSet<>(Arrays.asList(s.split(",")));
        System.out.println("count of tos:: "+ to.size());
        for(String e: to){
            System.out.println("emails:: "+ e);
        }
    }
}
