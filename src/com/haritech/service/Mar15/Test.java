package com.haritech.service.Mar15;

public class Test {
    public static void main(String[] args){
        int a = 10;
        //self increment/ decrement!!
//        a++;
//        a--;
//        ++a;
//        --a;
//        a = a + 1;
//        a += 1;

//        for(int i = 10; i < 20 ; i-=2){
//            System.out.println(i);
//        }
        //for-each
        int arr[] = {10,20,30,40,50};
        String s[] = {"abcd", "xyz","pqr"};

        for(int i=0; i<arr.length && i > 0; i++){
            System.out.println(arr[i]);
        }

        //for each
        for(String i : s){
            System.out.println("i is::"+i);
        }
        int b = 0;
        //infinite forloop
        for(;;){
            System.out.println("infinite");
            b+=1;
            if(b==10){
                break;
            }
        }
    }
}
