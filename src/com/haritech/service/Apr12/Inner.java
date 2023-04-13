package com.haritech.service.Apr12;

//member inner class
//local inner class
//static inner class
//annoymous class.
class InnerEx {
    int a = 10;
    //inner class.
    class Test{
        void display(){
            System.out.println(a);
        }
    }
    public InnerEx.Test getObject(){
        return this.new Test();
    }

}

public class Inner{
    public static void main(String args[]){
        InnerEx ie = new InnerEx();
        InnerEx.Test it = ie.new Test();
        InnerEx.Test it1 = ie.new Test();

        InnerEx ie1 = new InnerEx();
        InnerEx.Test it2 = ie1.new Test();
        it.display();
    }
}
