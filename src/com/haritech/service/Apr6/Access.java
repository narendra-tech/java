package com.haritech.service.Apr6;

class Test{
    private int a;
    private void test(){
        System.out.println("test method");
    }
    public void verify(){
        test();
        System.out.println("a value is::"+a);
    }
}
//Design patterns. => singleTon.
class TestPrivate{
    private static TestPrivate testPrivate = null;
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    private TestPrivate(){
        System.out.println("this is private constructor");
    }
    static TestPrivate getInstance(){
        if(testPrivate == null){
            testPrivate =  new TestPrivate();
        }
        return testPrivate;
    }
}

//Access specifiers: private, public, default, protect.
public class Access{

    public static void main(String args[]){
        TestPrivate tp = TestPrivate.getInstance();
        TestPrivate tp1 = TestPrivate.getInstance();
        TestPrivate tp2 = TestPrivate.getInstance();
        System.out.println(tp);
        System.out.println(tp1);
        System.out.println(tp2);

        tp.setName("Hari tech");
        tp1.setName("Kohli");
        tp2.setName("thakur");
        System.out.println(tp1.getName());
        System.out.println(tp2.getName());

        Test t = new Test();
        DefaultSpecifier ds = new DefaultSpecifier();
        ds.specifier();
        t.verify();
        //these are private properties. not able to access.
//        t.test();
//        System.out.println(t.a);

    }
}
