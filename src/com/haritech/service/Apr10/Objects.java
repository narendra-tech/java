package com.haritech.service.Apr10;

import java.lang.reflect.Constructor;

//how many ways to create object in java. => 6 ways
public class Objects {

    public Objects(String name){
        System.out.println("inside constructor::"+name);
    }

    public Objects(){
        System.out.println("default constructor");
    }

    private void test(){
        System.out.println("this is test method");
    }
    public static void main(String args[]){
        //by using new keyword.
        Objects obj = new Objects();

        //by using newInstance method. => reflection
        try{
            Class co = Objects.class;//Class.forName("com.haritech.service.Apr10.Objects");
            Objects ob = (Objects)co.newInstance(); //type casting.
            System.out.println("object is::"+ob);
            ob.test();
        }catch (Exception cnf){
            System.out.println(cnf);
        }

        //by using newInstance method. with constructor => reflection
        try{
            Class co = Class.forName("com.haritech.service.Apr10.Objects");
            Constructor cons = Objects.class.getConstructor(String.class);
            System.out.println("object is::"+cons);
            Objects ob = (Objects)cons.newInstance("hello"); //type casting.
            System.out.println("3rd approach::"+ob);
            ob.test();
        }catch (Exception cnf){
            System.out.println(cnf);
        }

    }
}
