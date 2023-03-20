package com.haritech.service.Mar20;

//keywords.
public class Test {
    //break, continue?

    public static void main(String[] args){

        /*for(int i=0;i <10;i++){
            if(i == 5){
                break;
            }
            System.out.println("i value is:"+i);
        }*/

        //continue!!
        for(int i=0;i <10;i++){
            if(i == 5){
                continue;
            }
            System.out.println("i value is:"+i);
        }

        //break
        int a = 0;
        while(a <=10){
            if(a==6){
                break;
            }
            a = a +1;

        }
    }

}
