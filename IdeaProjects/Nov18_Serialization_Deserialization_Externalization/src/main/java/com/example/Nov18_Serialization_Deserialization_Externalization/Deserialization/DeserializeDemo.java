package com.example.Nov18_Serialization_Deserialization_Externalization.Deserialization;

import com.example.Nov18_Serialization_Deserialization_Externalization.Serialization.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("student.ser"));
        Student s1 = (Student) ois.readObject();
        ois.close();

        System.out.println("Deserialized: " + s1.name);

    }
}