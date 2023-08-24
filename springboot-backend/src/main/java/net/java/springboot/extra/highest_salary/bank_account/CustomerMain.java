package net.java.springboot.extra.highest_salary.bank_account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerMain {
    public static void main(String[] args) {
        //Customer customer=new Customer();
        List<Customer> customerList= Arrays.asList(
                new Customer("Yonas",1),
                new Customer("Mussie",2),
                new Customer("Efrem",3),
                new Customer("Senay",4));
        customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(1).limit(2).forEach(System.out::println);
        List<Customer> customerList1=customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(1).limit(2).collect(Collectors.toList());
        System.out.println("Printing Sorted Customer"+customerList1);


        customerList.stream().sorted(Comparator .comparingDouble(Customer::getAccountBalance).reversed()).skip(1).forEach(System.out::println);

        customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(1).forEach(System.out::println);

//        customerList.stream().


        List<Customer> customers= new ArrayList<>(customerList);
        customers.add(new Customer("Anu",5));
        customers.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance)).skip(2).limit(3).forEach(System.out::println);

        List<Customer> printCustomers= customers.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance)).skip(3).limit(4).collect(Collectors.toList());
        System.out.println(printCustomers);
    }
}
