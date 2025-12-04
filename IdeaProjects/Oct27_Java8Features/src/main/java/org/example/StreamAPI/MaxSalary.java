package org.example.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxSalary {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1,"Shreyash",20000),
                new Employee(2,"Ritesh",22000),
                new Employee(3,"Pratik",20000),
                new Employee(4,"Shubham",20000)
        );

        Employee maxSalary = employee.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println("Employee with Maximum Salary: " + maxSalary);
    }
}
