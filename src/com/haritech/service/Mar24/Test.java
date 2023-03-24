package com.haritech.service.Mar24;

public class Test {
    //strings
    public static void main(String args[]){
        String s = "hello world";//string pool
        String a = new String("HELLO world");//heap

        //object comparison.
        System.out.println("eqality check:"+(s == a));

        //content comparison
        System.out.println(s.equals(a));

        //content comparison with case insensite.
        System.out.println(s.equalsIgnoreCase(a));

        //substring
        System.out.println("substring::"+s.substring(2));
        System.out.println("substring::"+s.substring(2,7));

        String c = "\"helloworld\"";
        System.out.println(c);

        //split
        String b = "hello world java python";
        String[] arr = b.split("\\s");//regular expression \s => space
        for(String i : arr){
            System.out.println(i);
        }

        //split based on comma.
        String d = "hello,world,java,python";

        //contains.
        String e = "kohli,dhoni,yuvi,rohit,azarjadeja";
        System.out.println(e.indexOf("jadeja"));
        if(e.indexOf("jadeja") >= 0){

        }


    }
}
