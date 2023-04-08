package com.haritech.service.Apr4;

//multiple inherientce.
//multilevel inheritence.

abstract class Example{
    abstract void display();
}

class Example2 extends Example{
    void display(){
        System.out.println("display method");
    }
}

public class Sample extends Example2{
}
