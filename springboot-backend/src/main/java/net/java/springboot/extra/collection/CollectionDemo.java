package net.java.springboot.extra.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollections= new ArrayList<>();
        fruitCollections.add("banana");
        fruitCollections.add("apple");
        fruitCollections.add("mango");

        System.out.println(fruitCollections);

        fruitCollections.remove("apple");
        System.out.println(fruitCollections);

        System.out.println((fruitCollections.contains("banana")));

        fruitCollections.forEach(x-> System.out.print(x+ " "));

        Collection<Object> c=new ArrayList();
        c.add("mm");
        c.add(122);

    }
}
