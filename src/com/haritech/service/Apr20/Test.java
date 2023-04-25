package com.haritech.service.Apr20;

//errors, exceptions(checked, unchecked).
//throw, throws
public class Test {
    String s = new String("hello world");
    String s1 = "JAVA";
    String s2;

    public void test(){
        throw new ArithmeticException();
    }

    public static void main(String args[]){
        Test t = new Test();
        t.s1 = "100";
        t.s1.toLowerCase();
        if(t.s2 != null){//handle null pointer exception.
            System.out.println("data:::"+t.s2.toLowerCase());
        }
        t.test();

        //throw. => raising/creating the exception.
        throw new ArithmeticException();
//        System.out.println("this is 20 the line");


    }
}

//Exception skeleton
//Throwable => Exception => remaining exceptions.
