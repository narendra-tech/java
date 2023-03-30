package com.haritech.service.Mar20;

//in the variable level
//in the method level
//in the class level.

final class Example{
    int multiplication(int a, int b){
        return a * b;
    }
}

class Sample{
    static final void add(int a, int b){
        System.out.println(a+b);
    }
}

public class Test1 extends Sample{
    //static, abstract, final.
    //public, private, protect, default.

//    static void add(int a, int b){
//        System.out.println(a+b);
//    }
    //constant
    final static int a = 10;
    public static void main(String args[]){
        int b = a + 1;
        add(10,20);
    }
}
