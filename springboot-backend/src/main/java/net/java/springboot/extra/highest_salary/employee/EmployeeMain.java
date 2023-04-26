package net.java.springboot.extra.highest_salary.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee("Yonas",123.45));
        employeeList.add(new Employee("Efrem",456.78));
        employeeList.add(new Employee("Mussie",234.12));
        employeeList.add(new Employee("Senay",214.68));


        //nth highest salary in this case 2nd
        Optional<Employee> sorted = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println("Second Highest Salary Paid Employee: "+ sorted.get());
        System.out.println("Second Highest Salary Paid: "+sorted.get().getSalary());

        //another way to retrieve highest salary
        //nth highest salary in this case 4nd

        Optional<Double> sortedSal = employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(3).findFirst();
        System.out.println("Fourth Highest Salary Paid: "+sortedSal.get());


        employeeList.stream().map(Employee::getSalary).sorted().limit(2).forEach(System.out::println);


        List<Employee> sorted1 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList());
        System.out.println("Top Two Highest Salary Paid Employee: "+ sorted1);

        List<Employee> sorted2 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).limit(2).collect(Collectors.toList());
        System.out.println("Bottom Two Lowest Salary Paid Employee: "+ sorted2);
//        System.out.println("Top Two Highest Salary Paid Employee: "+ Collections.sort(sorted1));

        //Comparing using Comparable interface
        Collections.sort(employeeList);
        System.out.println("Sorting Using Comparable: "+employeeList);

        //Comparing Using Comparator interface using SalaryComparator class
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("Sorting Using Comparator based on salary: "+employeeList);


        //Comparing using Comparator interface using NameComparator class
        Collections.sort(employeeList, new NameComparator());
        System.out.println("Sorting Using Comparator based on name: "+employeeList);

        List<Employee> employees= employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(2).collect(Collectors.toList());


        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(2).findFirst();

        employeeList.stream().map(Employee::getSalary).sorted().skip(1).limit(2).collect(Collectors.toList());

    }


}
