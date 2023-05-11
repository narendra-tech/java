package com.haritech.service.May11;

//Ex: functional interface.
@FunctionalInterface
interface Example{
    void display();
    default String myName(){
        return "Hello World";
    }
}

//Runnable interface, Comaparator interface => Functional interface.

//1). you need to implemenent the interface.
//2).anymous inner class.
//3). lambda. => state less.

//functional interface
public class FunctionInf {
    public static String fruit = "Apple";
    public String player;
    FunctionInf(String player){
        this.player = player;
    }


    public void testInf(){
        Example ex2 = () -> System.out.println("this is lambda for display::"+this.player);
        ex2.display();
    }

    public static void main(String args[]){
        //annaymouns inner class.
        Example ex = new Example() {
            String fruit = "Orange";//instance variable.
            @Override
            public void display() {
                System.out.println("this is override display method"+ this.fruit);
            }
        };
        ex.display();
        ex.myName();

        //scope => static main method.
        Example ex1 = () -> System.out.println("this is lambda::"+fruit);
        ex1.display();
        ex1.myName();

        Example ex2 = () -> {
            System.out.println("Hello world");
            System.out.println("Hi friends");
            System.out.println("Java programming");
        };

        ex2.display();

        FunctionInf fif = new FunctionInf("Dhoni");
        fif.testInf();
    }
}
