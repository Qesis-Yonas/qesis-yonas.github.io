package net.java.springboot.extra.highest_salary.bank_account;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExcerciseMain {
    public static void main(String[] args) {
        Customer customer1=new Customer("Yonas",12.32);
        List<Customer> customerList= new ArrayList<>();
        customerList.add(customer1);
        customerList.add(new Customer("Mussie",53.23));
        customerList.add(new Customer("Efrem",73.45));
        customerList.add(new Customer("Senay",3.23));


        customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(1).limit(1).forEach(System.out::println);
        List<Customer> result= customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(2).limit(2).collect(Collectors.toList());


        Optional<Customer> cust=customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(2).limit(1).findFirst();
        customerList.stream().sorted(Comparator.comparingDouble(Customer::getAccountBalance).reversed()).skip(1).limit(1);
    }
}
