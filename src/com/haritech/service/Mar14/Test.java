package com.haritech.service.Mar14;

public class Test {
    //if, else, else if condition a > b, a < b, a >= b
    void conditions(int a, int b, int c){

        if(a != 10){
            System.out.println("this is if condition");
        }else if(a > 10){
            System.out.println("this is 2nd if condition");
        }else{
            System.out.println("else block");
        }
    }

    void loops(){
        //for(startingpoint; condition; increment/decrement)
        //i++ => i = i +1
        //i-- => i = i -1
        // => i = i - 2
        for(int i = 10; i >= 1; i=i+1){
            System.out.println(i);
        }

    }

    public static void main(String args[]){
        Test t = new Test();
        t.loops();
    }

}
