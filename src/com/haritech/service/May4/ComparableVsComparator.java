package com.haritech.service.May4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Employee implements Comparable<Employee>{
//    private int id;
//    private String name;
//    private int age;
//    private int marks;
//    Employee(int id, String name, int age, int marks){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.marks = marks;
//    }
//
//    @Override
//    public int compareTo(Employee employee){
//        if(this.marks > employee.marks){
//            return -1;
//        }else if(this.marks < employee.marks){
//            return 1;
//        }else {
//            return 0;
//        }
////        return this.name.compareTo(student.name);
//    }
//
//    public String toString(){
//        return this.name + " : " + this.marks;
//    }
//}

class Employee {
    public int id;
    public String name;
    public int age;
    public int marks;
    public Employee(int id, String name, int age, int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString(){
        return this.name + " : " + this.marks+" : "+this.age;
    }
}

class MarksComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee var1, Employee var2){
        if(var1.marks > var2.marks){
            return -1;
        }else if(var2.marks < var2.marks){
            return 1;
        }else {
            return 0;
        }
    }
}

class AgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee var1, Employee var2){
        System.out.println("var1::"+var1.name+":: var2::"+var2);
        if(var1.age > var2.age){
            return -1;
        }else if(var2.age < var2.age){
            return 1;
        }else {
            return 0;
        }
    }
}

public class ComparableVsComparator {
    public static void main(String args[]){

        Employee st1 = new Employee(2, "kohli", 22, 55);
        Employee st2 = new Employee(3, "sharma", 20, 75);
        Employee st3 = new Employee(1, "dhoni", 36, 82);

        List<Employee> employees = new ArrayList<>();
        employees.add(st1);
        employees.add(st2);
        employees.add(st3);
        System.out.println("before sorting students::"+employees);
        //sort the students based on marks.
//        Collections.sort(employees, new MarksComparator());
        Collections.sort(employees, new AgeComparator());
        System.out.println("after sorting students::"+employees);


    }
}
