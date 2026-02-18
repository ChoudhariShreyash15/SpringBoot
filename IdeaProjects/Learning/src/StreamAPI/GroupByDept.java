package StreamAPI;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee1(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class GroupByDept {
    public static void main(String[] args) {
        List<Employee1> employees1 = List.of(
                new Employee1(1, "Amit", "IT", 60000),
                new Employee1(2, "Ravi", "HR", 50000),
                new Employee1(3, "Neha", "IT", 70000),
                new Employee1(4, "Priya", "Finance", 65000),
                new Employee1(5, "Suresh", "HR", 55000)
        );

        employees1.stream()
                .collect(Collectors.groupingBy(Employee1::getDept))
                .keySet()
                .stream()
                .forEach(System.out::println);

        employees1.stream()
                .collect(Collectors.groupingBy(Employee1::getDept))
                .entrySet()
                .stream()
                .forEach(System.out::println);

//        System.out.println(groupedByDept);
//
//        groupedByDept.entrySet().forEach(System.out::println);

        Map<String, Double> resultMap = new HashMap<>();

        List<String> departments = employees1.stream()
                .map(Employee1::getDept)
                .distinct()
                .collect(Collectors.toList());

        for (String dept : departments) {

            Optional<Double> secondHighestSalary =
                    employees1.stream()
                            .filter(emp -> emp.getDept().equals(dept))   // filter by dept
                            .map(Employee1::getSalary)                     // get salary
                            .distinct()
                            .sorted(Comparator.reverseOrder())            // high to low
                            .skip(1)                                      // skip highest
                            .findFirst();                                 // 2nd highest

            secondHighestSalary.ifPresent(salary ->
                    resultMap.put(dept, salary)
            );

            System.out.println(resultMap);
        }
    }
}
