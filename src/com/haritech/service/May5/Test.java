package com.haritech.service.May5;

import java.util.*;


class Employee {
    public int id;

    public String name;

    public int age;

    public double marks;


    public Employee(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString(){
        return this.name + " : " + this.marks+" : "+this.age;
    }

    public String getName(){
        return name;
    }


    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public Double getMarks(){
        return marks;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAges(int[] arr){

    }

}

public class Test {
    public static void main(String args[]){
        Employee st1 = new Employee(2, "kohli", 22, 55);
        Employee st2 = new Employee(3, "sharma", 20, 75);
        Employee st3 = new Employee(1, "dhoni", 36, 82);
        List<Employee> em = new ArrayList<>();
        em.add(st2);
        em.add(st3);
        em.add(st1);
//        Map<Double, String> m = new HashMap<>();
//        Iterator<Employee> ei = em.iterator();
//        while (ei.hasNext()){
//            Employee e = ei.next();
//            m.put(e.marks, e.name);
//        }
//        System.out.println("map is::"+m);

        Comparator<Employee> cmp = Comparator.comparing(Employee::getAge);

        Collections.sort(em, cmp);
        System.out.println("em is::"+em);
    }
}

