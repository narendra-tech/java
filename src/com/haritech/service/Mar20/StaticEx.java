package com.haritech.service.Mar20;

//in the variable level
//in the method level
//in the class level.
public class StaticEx {
    static int a = 10;

     int multiple(int a, int b){
        return a * b;
    }

    static class Demo{
        void display(){
            System.out.println("this is display method");
        }
    }
    static public void main(String args[]){
        StaticEx se = new StaticEx();
        se.multiple(10, 20);
       /* StaticEx.Demo d = new StaticEx.Demo();
        d.display();*/
    }
}



