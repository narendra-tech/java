package com.haritech.service.Apr24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List(interface) => ArrayList(class)
public class ListMethods {

    public static void main(String args[]){
        //mutable.
        List<String> l = new ArrayList<>();

        List num = new ArrayList();
        num.add(10);
        num.add("hello world");
        num.add(1.235);
        System.out.println("num is::"+num);
        num.set(0, (Byte)num.get(0) + 1);
//        num.set(1, (Integer)num.get(1) + 1);

        //add elements; => add element into end of the list.
        l.add("Orange");
        l.add("Apple");
        l.add(0,"Grapes");//insert at particular position.


        List<String> l2 = new ArrayList();
        l2.add("banana");
        l2.add("pineapple");

//        l.addAll(l2);
        l.addAll(0, l2); // banana, pineapple, grapes, orange, apple.

        System.out.println("first element::"+l.get(0));
        System.out.println("first element::"+l.get(1));
        System.out.println("first element::"+l.get(2));

        //remove elements;
        l.remove(1);
        System.out.println(l.remove("Apple"));
        l.removeAll(l2); // Grapes, orange, apple.
        l.removeIf(obj -> obj.equalsIgnoreCase("Apple"));// remove Apple from l.


        //iterate or retrive the elements.

        //iterator
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //foreach
        for(String fruit : l){
            System.out.println("fruit name is::"+fruit);
        }

        l.forEach((fruit) -> {
            System.out.println("element is::"+fruit);
        });

        for(int i=0; i<l.size();i++){//normal way.
            System.out.println("position::"+i+" element "+l.get(i));
        }

        System.out.println("list is::"+ l);//@asdfsfdasf


        //update the elements
        l.set(0,"watermelon");
        System.out.println(l);

    }
}
