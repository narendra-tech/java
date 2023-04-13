package com.haritech.service.Apr12;

import java.io.*;

class Test implements Serializable {
    private static long serialVersionUID = -2935662441809187961l;
    int age;
    static char gender = 'M';
    transient String address; //transient properties are not serializable.
    Test(int age, String address){
        this.age = age;
        this.address = address;
    }
}

public class SerializationEx {
    public static void main(String args[]){
        Test t = new Test(25,"kohli");
        String filename = "serialize";
        //serialization.
        try(FileOutputStream fo = new FileOutputStream(filename)) {
//            FileOutputStream fo = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(t);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialization
        Test.gender = 'F';
        try {
            FileInputStream fi = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fi);
            Test test = (Test) ois.readObject();
            ois.close();
            System.out.println("age::"+test.age);
            System.out.println("address::"+test.address);
            System.out.println("address::"+Test.gender);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
