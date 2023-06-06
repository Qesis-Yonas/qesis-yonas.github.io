package net.java.springboot.extra.highest_salary.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, Double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o1) {
        return (int) (getSalary()-o1.getSalary());
    }

//    public static void main(String []args){
//        List<Employee> employees= Arrays.asList(
//                new Employee("Yonas",123.123),
//                new Employee("Mussie",456.456),
//                new Employee("Efrem",789.789)
//        );
//        Optional<Employee> employee =employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst();
//        System.out.println(employee);
//    }
}
