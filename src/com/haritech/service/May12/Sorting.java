package com.haritech.service.May12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student{
    int age;
    int marks;
    String name;

    Student(int age, int marks, String name){
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    public String toString(){
        return this.name+" : "+this.age+" : "+this.marks;
    }

}
public class Sorting {
    public static void main(String args[]){
        List<Student> students = Arrays.asList(new Student(40,5,"Dhoni"),
                new Student(35,2,"Virat"),
                new Student(36,9,"Sharma"),
                new Student(30,7,"Rahul"));
//        Collections.sort(students, (st1, st2) -> st1.name.compareTo(st2.name));
        Collections.sort(students, (st1, st2) -> {
            if(st1.age < st2.age) return 1;
            else if(st1.age > st2.age) return -1;
            else return 0;
        });
        System.out.println(students);
    }
}
