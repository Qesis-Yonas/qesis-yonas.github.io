package net.java.springboot.extra.highest_salary.employee;

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
}
