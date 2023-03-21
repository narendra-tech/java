package com.haritech.service.Mar21;

public class Test {
    static final int a = 10; //static final
    static int b = 20; //static variable
    int c = 30;//instance variable.
    final int d = 40;

    public static void main(String args[]){
        System.out.println("a value::"+Test.a+" b value is:: "+b);
//        a = a + 1;
        Test.b = Test.b + 1;
        Test t = new Test();
        System.out.println("c value is::"+t.c +"d value is::"+t.d);

    }
    //Test.main()
}
