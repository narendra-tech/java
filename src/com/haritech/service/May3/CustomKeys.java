package com.haritech.service.May3;


import java.util.HashMap;
import java.util.Map;

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;
    Student(int id, String name, int age, int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

//    @Override
    public int hashCode(){
        return this.id + this.age + this.marks;
    }

//    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
       if(this.age == st.age && this.id == st.id){
           return true;
       }
       return false;
    }
}

public class CustomKeys {
    public static void main(String args[]){
        Map<Student, String> m = new HashMap<>();
        Student st1 = new Student(2, "kohli", 22, 55);
        Student st2 = new Student(3, "sharma", 32, 75);
        Student st3 = new Student(1, "dhoni", 36, 82);

        m.put(st1,"third");
        m.put(st3, "first");
        m.put(st2, "second");

        System.out.println("data is::"+m);
//        System.out.println("hascode st3::"+st3.hashCode());

        Student st4 = new Student(1, "dhoni", 36, 86);
//        System.out.println("hascode st4::"+st4.hashCode());

        System.out.println("record is::"+m.get(st4));

    }
}
