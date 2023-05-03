package com.haritech.service.Apr28;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;
    String className;
    public Student(int marks, int id, String name, String className){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.className = className;
    }

    public String toString(){
        return this.name + ":" + this.marks;
    }

    @Override
    public int compareTo(Student student) {
        if(this.marks > student.marks){
            return 1;
        }else if(this.marks < student.marks){
            return -1;
        }else{
            return 0;
        }
    }
}


//Linked hasset, Treeset
public class Sets {
    public static void main(String args[]){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Orange");
        lhs.add("Apple");
        lhs.add("Watermielon");
        lhs.add("Orange");
        System.out.println(lhs);
        lhs.remove("Apple");
        System.out.println(lhs);

        TreeSet ts = new TreeSet<String>();
        ts.add("Zebra");
        ts.add("Elephant");
        ts.add("Fox");
        ts.add("Ant");
        ts.add("Eagle");
        System.out.println(ts);
        //please check floor and ceiling.
        System.out.println(ts.ceiling("Elephant"));
        System.out.println(ts.floor("Elephant"));

        System.out.println(ts.higher("Elephant"));
        System.out.println(ts.lower("Elephant"));

        System.out.println(ts.first());
        System.out.println(ts.last());

//        System.out.println(ts.pollFirst());
        System.out.println(ts.subSet("Bafffelo", false ,"Fox", true));
        Student st1 = new Student(50, 2, "kohli", "I-class");
        Student st2 = new Student(60, 1, "dhoni", "II-class");
        Student st3 = new Student(45, 10, "sharma", "II-class");
        TreeSet<Student> tss = new TreeSet<>();
        tss.add(st1);
        tss.add(st2);
        tss.add(st3);
        System.out.println("treeset is::"+tss);

        TreeSet<Float> tf = new TreeSet<>();
        tf.add(10.32f);
        tf.add(10.12f);
        tf.add(10.45f);
        tf.add(10.09f);
        tf.add(10.46f);

        System.out.println("floor::"+tf.floor(10.46f));
        System.out.println("celining::"+tf.ceiling(10.32f));



    }

}
