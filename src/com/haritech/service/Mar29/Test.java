package com.haritech.service.Mar29;

import java.util.StringTokenizer;

public class Test {

    static void demo(){
        System.out.println("this is demo method");
    }

//    static int demo(int a, int b){
//        if(a>0 && b >0){
//            return a + b;
//        }
//        System.out.println("variables are invalid");
//        return 0;
////        return a + b;
////        return a - b;
//    }

//    static int demo(long l1, long l2){
//        return (int)(l1 - l2);
//    }

    static int demo(short l1, short l2){
        return (int)(l1 - l2);
    }

    //calculator => add, sub, multi, divison

    public static void main(String args[]){
        short a1 = 10;
        short a2 = 20;
        short a3 = 0;

        int a = demo(a1, a2);
        System.out.println("a values::"+a);
        int b = demo(a3,a2);
        //string buffer
        StringBuffer sb = new StringBuffer("training");
        sb = sb.append("hello").append("hai").append("java");
        System.out.println(sb.substring(2,7));
        System.out.println(sb.toString());


        //string builder
        StringBuilder sbu = new StringBuilder("training");
        String msg = sbu.append("hello").append("world").toString();

        StringTokenizer st = new StringTokenizer("hello,world,java,programme", ",");
        System.out.println("token count::"+st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
