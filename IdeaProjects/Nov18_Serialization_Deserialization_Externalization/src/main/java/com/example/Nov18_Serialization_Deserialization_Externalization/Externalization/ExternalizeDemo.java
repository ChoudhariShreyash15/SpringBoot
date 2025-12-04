package com.example.Nov18_Serialization_Deserialization_Externalization.Externalization;

import java.io.*;

class Employee implements Externalizable{
    int id;
    String name;
    transient String salary;

    public Employee() {}

    public Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name);
        out.writeUTF("****");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = in.readUTF();
        salary = in.readUTF();
    }
}

public class ExternalizeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee(1,"Shreyash","shree");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("emp.ser"));
        Employee e = (Employee) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("EmpID: " + e.id);
        System.out.println("EmpName: " + e.name);
        System.out.println("Empsalary: " + e.salary);
    }
}
