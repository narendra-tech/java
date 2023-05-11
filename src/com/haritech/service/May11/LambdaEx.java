package com.haritech.service.May11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    int id;
    int age;
    String name;
    int marks;

    private void setAge(int age){
        this.age = age;
    }
}

public class LambdaEx {
    public static void main(String args[]){
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("bananna");fruits.add("apple");fruits.add("jack");

        Collections.sort(fruits, (f1, f2) -> f1.compareTo(f2));
        System.out.println("sorted furits are::"+ fruits);

        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());

        Collections.sort(students, (s1, s2) -> {
            if(s1.marks > s2.marks) return 1;
            else if(s1.marks < s2.marks) return -1;
            else return 0;
        });
    }
}
