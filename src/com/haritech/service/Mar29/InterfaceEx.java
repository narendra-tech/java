package com.haritech.service.Mar29;

interface Players{
    //?
    //properties. this is public and final
    int a = 10;
    void test();


}

public class InterfaceEx implements Players{
    public void test(){
        System.out.println("test method");
    }
    public static void main(String args[]){
        System.out.println(a);
    }
}
