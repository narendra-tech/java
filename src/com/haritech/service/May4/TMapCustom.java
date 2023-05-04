package com.haritech.service.May4;

import java.util.TreeMap;

class Student implements Comparable<Student>{
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
        return this.id + this.age;
    }

    //    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
        if(this.age == st.age && this.id == st.id){
            return true;
        }
        return false;
    }

    @Override
     public int compareTo(Student student){
//        if(this.marks > student.marks){
//            return -1;
//        }else if(this.marks < student.marks){
//            return 1;
//        }else {
//            return 0;
//        }
        return this.name.compareTo(student.name);
    }
}

public class TMapCustom {
    public static void main(String args[]){
        //Treemap with custom object as key.
        Student st1 = new Student(2, "kohli", 22, 55);
        Student st2 = new Student(3, "sharma", 32, 75);
        Student st3 = new Student(1, "dhoni", 36, 82);

        TreeMap<Student, String> ranks = new TreeMap<>();
        ranks.put(st1, "third");
        ranks.put(st2, "second");
        ranks.put(st3, "first");

        System.out.println("ranks is::"+ranks);

    }
}
