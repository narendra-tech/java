package com.haritech.service.Apr13;

interface Test{
    public void display();
}

class Sample implements Test{
    public void display(){
        System.out.println("this is display method");
    }

    public void example(){
        System.out.println("this is example method");
    }
}

public class Annoymous {
    public static void main(String args[]){
        Test t1 = new Sample();
        t1.display();
        ((Sample)t1).example();


        //annoymous class.
        Test t = new Test() {
            @Override
            public void display() {
                System.out.println("this is display method");
            }
        };

        Test t2 = new Test() {
            @Override
            public void display() {
                System.out.println("this is display method");
            }
        };
        t.display();
    }

}
