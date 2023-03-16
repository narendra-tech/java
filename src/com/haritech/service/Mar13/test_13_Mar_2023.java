package com.haritech.service.Mar13;

public class test_13_Mar_2023 {
    //datatypes covered.

    //operators.
    //number datatypes => byte, short, int, long, float, double

    public static void main(String[] args){
        //unary opertors
        int a = 10;
        System.out.println("logical and:"+ (++a));//11
        System.out.println("logical and:"+ (a++));//11
        System.out.println("logical and:"+ (a--));//12
        System.out.println("logical and:"+ (--a));//10

        //&&, ||, !
        System.out.println("logical and:"+ (true && true));
        System.out.println("logical or:"+(true || false));
        System.out.println("logical not:"+(!true));


        int c = -5;
        int d = -6;
        //>, <, >= <=, !=, ==
        System.out.println("gretarthan: "+ (c > d));
        System.out.println("lessthan: "+ (c < d));
        System.out.println("gr eq: "+ (10 >= 10.0));
        System.out.println("less eq: "+ ( 20 <= 20.0));
        System.out.println("equality: "+ (10 == 20));
        System.out.println("not equal: "+ ( 10 != 20));


        //+, -, *, /, %
        a = 10;
        int b = 20;
        float f = ((float)a / b); // typecasting.
        System.out.println("addition: "+ (a + b));
        System.out.println("subtraction: "+ (a - b));
        System.out.println("multiplication: "+ (a * b));
        System.out.println("divison: "+ f);
        System.out.println("modulo: "+ (a % b));

    }
}
