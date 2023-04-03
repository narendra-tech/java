package com.haritech.service.Apr3;

public class Test {
    //pass by value
    public String name;

    void display(int a, int b){
        System.out.println("result:"+(a+b));
        a = a + 10;
        b = b + 10;
    }

    //pass by reference.
    void sample(Test test){
        test.name = "hari tech";
    }

    void example(int[] arr){
        arr[0] = 10;
    }

    //infinite arguments.
    void infArguments(int... args){
        System.out.println("args is::"+ args);
        for(int i : args){
            System.out.println("i is::"+ i);
        }
    }

    void infArguments(float f, String s,int... args){
        System.out.println("args is::"+ args);
        for(int i : args){
            System.out.println("i is::"+ i);
        }
    }

    void infArguments(float f, String s,Test... args){
        System.out.println("args is::"+ args);
        for(Test i : args){
            System.out.println("i is::"+ i.name);
        }
    }

    public static void main(String args[]){
        Test t = new Test();
        int a = 30;
        int b = 40;
        t.display(a, b);
        System.out.println("after display a invoke:"+a);
        System.out.println("after display  b invoke:"+b);

        System.out.println("before sample name is:"+t.name);
        t.sample(t);
        System.out.println("after sample name is:"+t.name);

        int[] ar = new int[10];
        ar[0] = 0;
        ar[1] = 1;
        System.out.println("before example is:"+ar[0]);
        t.example(ar);
        System.out.println("after example is:"+ar[0]);

        t.infArguments();
        t.infArguments(10,20);
        t.infArguments(1,2,3,4,5);

//        t.infArguments(0.12f, "hello");
        t.infArguments(0.12f, "hello", 100, 200, 300);

        Test test1 = new Test();
        test1.name = "hello";
        Test test2 = new Test();
        test2.name = "world";
        Test test3 = new Test();
        test3.name = "hai";
        t.infArguments(0.12f, "hello", test1, test3, test2);
    }
}
