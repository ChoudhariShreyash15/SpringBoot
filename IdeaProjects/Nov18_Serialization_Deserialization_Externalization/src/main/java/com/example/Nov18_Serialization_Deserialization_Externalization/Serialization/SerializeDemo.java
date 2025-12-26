package com.example.Nov18_Serialization_Deserialization_Externalization.Serialization;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "Mahesh");

        //Serialization
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("E:/student.ser"))) {
            oos.writeObject(s);
            oos.close();
            System.out.println("Object Serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Deserialization
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            Student s1 = (Student) ois.readObject();
            ois.close();
            System.out.println("Deserialized: " + s1.name);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}