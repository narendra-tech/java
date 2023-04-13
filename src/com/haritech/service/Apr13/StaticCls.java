package com.haritech.service.Apr13;

public class StaticCls {
    static class Example{
        public void display(){
            System.out.println("this is display method");
        }
    }

    public static void main(String args[]){
        StaticCls.Example se = new StaticCls.Example();
        se.display();
    }
}
