package com.haritech.service.Mar24;

public class Test {
    //strings
    public static void main(String args[]){
        String s = "hello world";//string pool
        String a = new String("hello world");//heap
        String a1 = new String("hello world");

        //object comparison.
        System.out.println("eqality check:"+(a1 == a));

        //content comparison
        System.out.println(s.equals(a));

        //content comparison with case insensite.
        System.out.println(s.equalsIgnoreCase(a));

        //length of the string
        System.out.println("count of characters:" + s.length());

        //substring
        System.out.println("substring1::"+s.substring(2));
        System.out.println("substring2::"+s.substring(2,7));

        String c = "hello\"world";
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
        System.out.println(e.indexOf(new String("jadeja")));

        if (e.contains(new String("yuvi"))) {
            System.out.println("yes yuvi exists");
        }

        System.out.println("character at "+s.charAt(0));
        System.out.println(String.join("@","hello","world","java","python"));

        e = "hello world";
        System.out.println(e.replace("l", "m"));
        System.out.println(e.startsWith("hello"));
        System.out.println(e.startsWith("wordl"));

        System.out.println(e.lastIndexOf("l"));

        e = "  hello   world       ";
        System.out.println(e.trim());

        a="hello world";
        e=" hello world";
        a.equalsIgnoreCase(e.trim());

        String name = new String("hello");
        String address = new String("hello");
        String newAddr = address.intern();
        System.out.println("result is: "+name.intern() == address.intern());

        //formatting.


    }
}
