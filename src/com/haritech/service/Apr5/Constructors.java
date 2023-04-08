package com.haritech.service.Apr5;

import com.haritech.service.Apr6.DefaultSpecifier;
import com.haritech.service.Apr6.ProtectedSpecifier;

public class Constructors extends ProtectedSpecifier{
    //instance variables.
    int a;
    int b;

    int x;
    int y;

    final private String name;
    final private int amount;

    static final int age;
    //static block.
    static {
        age = 50;
        System.out.println("static block1");
    }
    static {
        System.out.println("static block2");
    }

    //initalize block
    {
        this.name = "abcd";
        this.amount = 10;
        System.out.println("final variables");
    }
    {
        System.out.println("final variables2");
    }

//    Constructors(String name, int amount){
//        this.name = name;
//        this.amount = amount;
//    }

    Constructors(int x, int y){//parametarized constructor
//        this();
        System.out.println("this is parameterized constructor::");
        this.x = x;
        this.y = y;
    }

    Constructors(){//default constructor!
        this(10,20);
        int a = 10;
        this.a = 20;
        System.out.println("this is constructor::"+a);
        System.out.println("this is constructor::"+this.a);
    }

    public static void main(String args[]){
        Constructors constructors = new Constructors();
        constructors.specifier();//protected specifier example.
//        System.out.println("a value is::"+constructors.x);
//        Constructors constructors = new Constructors();
    }
}
