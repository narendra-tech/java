package com.haritech.service.Mar16;

public class Test {







    public static void main(String args[]){
        //while.
        int a = 10;
        int b = -5;
        while(a > 0 && b > 0){
            System.out.println(a);
            a -= 1;//a = a + 1;
        }

        //print even numbers: 1 -> 20; by using while loop.
        //print odd numbers: 4 -> 30;

//        for(int i = 1; i<=20;i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        int i = 1;
//        while(i <= 20){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//            i += 1;
//        }
        int i = 1;
        do{
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//            i += 1;
            System.out.println("do while");
        }while(i >= 10);

        boolean c = false;
        if(c=true){
            System.out.println("");
        }

    }
}
