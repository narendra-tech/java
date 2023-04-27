package com.haritech.service.Apr25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Student extends Object{
    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int hashCode(){
        System.out.println("genereate hashcode");
        return this.id;
    }
}

public class LinkedListE {
    public static void main(String args[]){
        //List with custom objects.
        List<Student> l = new ArrayList<>();
        l.add(new Student(1,"vedansh", 90));
        l.add(new Student(2,"venkatesh", 92));
//        Student st = new Student(3,"venki", 95);
//        l.add(st);
//        Student st2 = new Student(3,"venki", 95);
//        l.remove(st2);
//
//        System.out.println("elements is::"+l.size());
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("Orange");
        ll.addFirst("Apple");
        ll.addLast("watermileon");
        ll.addLast("grapes");
        System.out.println("size::"+ll.size());
        ll.add(ll.size() / 2, "guva");
        System.out.println(ll);
        //organge,apple,guva,watermileon,grapes

        ll.getFirst();
        ll.getLast();

        ll.removeFirst();
        ll.removeLast();

        ll.removeFirstOccurrence("Apple");
        ll.removeLastOccurrence("Guva");


        ll.remove();

        ll.push("");
    }
}
