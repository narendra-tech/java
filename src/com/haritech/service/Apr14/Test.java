package com.haritech.service.Apr14;

//inheritence => multilevel inheritence, multiple inheritence

//mulitlevel inheritence.
// A(parent)
//
//B(Child) extends A
//
//C(child) extends B

//multiple inheritence.
//interface1(parent)
//interface2(parent)
//class implements interface1, interface2

//polymarphisam => overriding, overloading
class Example{
    public int sample(int a, double d){
        System.out.println("this is example class sample method");
        return 0;
    }
}

public class Test extends Example{
    //overrdinign.
    public long sample(long a, float f){
        System.out.println("this is test class sample method");
        return 0;
    }

    public void display(long a){

    }

    public void display(int a){

    }
}