package com.haritech.service.Mar29;

interface Players{
    //?
    //properties. this is public and final
    int a = 10;
    void test();

    //default methods
    default void bioData(){
        System.out.println("player biodata");
//        highestScorer();
    }

    static void playerBioData(){
        System.out.println("player biodata");
    }

    //can write private methods also.
//    private void highestScorer(){
//
//    }
    void gameStartingTime(String time);
}

interface Coaches{
    void bestCoach();
    void gameStartingTime();
}

public class InterfaceEx implements Players, Coaches{
    public void test(){
        System.out.println("test method");
    }

    public void bestCoach(){
        System.out.println("I am best coach");
    }

    public void gameStartingTime(){
        System.out.println("Today evening 6 pm");
    }

    public void gameStartingTime(String t){
        System.out.println("Today evening 6 pm "+ t);
    }

    public static void main(String args[]){
        System.out.println(a);
        InterfaceEx ifex = new InterfaceEx();
        ifex.bioData();
        ifex.bestCoach();
        ifex.gameStartingTime();
        ifex.gameStartingTime("Tomorrow");
    }
}
