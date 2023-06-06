package net.java.springboot.extra.hashcoEqualsMethod;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }


    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);

        Map<Person, String> map = new HashMap<>();

        map.put(p1, "Value 1");
        map.put(p2, "Value 2");

        //If we dont override the hashcode a defualt hashcode is assigned to the objects p1 and p2
        //and as a result the out put results in 2 although the inputs are the same but this can be resolved by
        //Overriding hashcode which is demonstrated in Person2 class
        System.out.println(map.size());  // Output: 2

    }
}

