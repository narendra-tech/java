package com.haritech.service.Mar21;

//abstract => variable, method, class.
abstract class AbsExample {
    int a = 20;
    abstract int add(int a, int b);
//     int add(int a, int b){
//        return a +b;
//    }
}

class Demo extends AbsExample{
    int add(int a, int b){
        return a +b;
    }
}

 public class AbsEx {
    int a = 20;

    public static void main(String arg[]){
//        Demo demo = new Demo();
        AbsExample abse = new Demo();
        abse.add(10, 20);
    }

}
