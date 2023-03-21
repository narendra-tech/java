package com.haritech.service.Mar21;

enum Weeks{
    MONDAY,
    TUESDAY,
};

//class Fruits{
//    String name;
//    int cost;
//    Fruits(String name, int cost){
//        this.name = name;
//        this.cost = cost;
//    }
//}
enum Fruits{
    APPLE(20),
    ORANGE(10),
    GRAPES(15);
    int cost;
    Fruits(int cost){
        this.cost = cost;
    }
}

//String[] Weeks = {"MONDAY", "TUESDAY"};

//ENUM
public class EnumEx {
    public static void main(String args[]){
//        System.out.println(Weeks.MONDAY);
//        System.out.println(Weeks.TUESDAY);
//        System.out.println(Weeks.values());
        //for each
        /*for(Weeks we : Weeks.values()){
            System.out.println(we.ordinal());
            System.out.println(we.name());
        }*/

        for(Fruits fe : Fruits.values()){
            System.out.println(fe.ordinal());
            System.out.println(fe.name());
            System.out.println(fe.cost);
        }
    }
}
