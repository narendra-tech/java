package com.haritech.service.Apr13;

public class LocalInner {

    public Object example(){
        class Sample{
            void display(){
                System.out.println("display method");
            }
        }
//        return Sample;
        Sample s = new Sample();
        return s;
//        s.display();
    }

    public static void main(String args[]){
        LocalInner li = new LocalInner();
        Object ob = li.example();
        ((Sample)ob).display();
    }
}
