package StreamAPI;

import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, String it, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " -> " + salary;
    }
}

public class ThirdHighestSalary {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 90000),
                new Employee(2, "B", "IT", 80000),
                new Employee(3, "C", "IT", 70000),
                new Employee(4, "D", "IT", 60000),
                new Employee(5, "E", "IT", 50000)
        );

        Employee thirdHighest = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2)        // skip 1st and 2nd highest
                .findFirst()
                .orElse(null);

        System.out.println("3rd Highest Salary: " + thirdHighest);
    }
}