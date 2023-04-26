package net.java.springboot.extra.collection;

import java.util.ArrayList;
import java.util.List;

public class CreatArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers= new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        System.out.println(firstFivePrimeNumbers);



        List<Integer> nextFivePrimeNumbers= new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        System.out.println(nextFivePrimeNumbers);


        List<Integer> firstTenPrimeNumbers= new ArrayList<>(firstFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

        System.out.println(firstTenPrimeNumbers.get(2));

        List<Integer> removed= new ArrayList<>();
        removed.add(3);
        removed.add(19);
        removed.add(100);
        firstTenPrimeNumbers.removeAll(removed);


        System.out.println(firstTenPrimeNumbers);
    }
}
