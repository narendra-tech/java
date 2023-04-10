package com.haritech.service.Apr10;

public class ObjectCloning implements Cloneable{
    private String name;
    private int age;

    ObjectCloning(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]){
        ObjectCloning obj = new ObjectCloning("kohli", 30);

        //clone the object
        try{
            ObjectCloning obj2 = (ObjectCloning)obj.clone();
            System.out.println("obj2 is::"+obj2.name+" and age is::"+obj2.age);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
