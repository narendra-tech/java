package com.haritech.service.Mar17;

public class Test {

    //switch case
    //ternaory operator.


    static private boolean isPrimeNumber(int num){
        boolean flag = true;
        for(int i = 2; i< num / 2; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        int a = 10;
        String s = "NARE";
        //condition ? true case : false case;
        boolean b = a == 10 ? true : (a > 5 ? (a == 6 ? true : false) : false);
        System.out.println("b value is::"+b);
        switch (s){
            case "KOHLI":
                System.out.println("a is 5");
//                break;
            case "NARE":
                System.out.println("a is 6");
                System.out.println("2nd case");
//                break;
            default:
                System.out.println("this is default case");
        }
    }
    public static void mains(String[] args){
        System.out.println("19 is prime "+isPrimeNumber(19));
        //prime number
        for(int i=1;i < 20;i++){
            boolean flag = false;
            for(int j = 2; j < i / 2; j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("prime number::"+i);
            }

        }
    }
}
