package net.java.springboot.extra.codedecode.mapflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=TM6TZvVoAko

        //e1
        List<String> e1List= new ArrayList<>();
        e1List.add("Columbus");
        e1List.add("Fairfield");
        e1List.add("Arlington");
        Employee e1=new Employee(1,"Chris",e1List);

        //e2
        List<String> e2List= new ArrayList<>();
        e2List.add("Asmara");
        e2List.add("Mendefera");
        e2List.add("Keren");
        Employee e2=new Employee(2,"Yonas",e2List);

        //e3
        List<String> e3List= new ArrayList<>();
        e3List.add("Nairobi");
        e3List.add("Mombasa");
        e3List.add("Westlands");
        Employee e3=new Employee(3,"Yaye",e3List);

        List<Employee> empList= new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println(empList);

        List<List<String>> resultMap= empList.stream().map(emp->emp.getWorkedList()).collect(Collectors.toList());
        List<Integer> integerMap=empList.stream().map(emp->emp.getId()).collect(Collectors.toList());

        System.out.println("Using Map for Work List "+resultMap);
        System.out.println("Using Map for Id List "+integerMap);

        List<String> resultFlatMap= empList.stream().flatMap(employee -> employee.getWorkedList().stream()).collect(Collectors.toList());
        // result is [Columbus, Fairfield, Arlington, Asmara, Mendefera, Keren, Nairobi, Mombasa, Westlands]
        // but if we have redundunt result and we want to remove the redunduncy we can use Set instead of List
        System.out.println("Using FlatMap for Work List "+resultFlatMap);
    }
}
