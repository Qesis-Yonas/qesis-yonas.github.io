package net.java.springboot.extra.hashcoEqualsMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
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
        Person2 other = (Person2) obj;
        return age == other.age && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    public static void main(String[] args) {
        Person2 p1 = new Person2("John", 25);
        Person2 p2 = new Person2("John", 25);

        Map<Person2, String> map = new HashMap<>();

        map.put(p1, "Value 1");
        map.put(p2, "Value 2");

        //because we have overrided the hoshcode the out put is 1 eventhough the inputs are two but of the same
        System.out.println(map.size());  // Output: 1

    }
}
