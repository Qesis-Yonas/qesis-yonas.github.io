package net.java.springboot.extra.highest_salary.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(2,"Yonas","Math",88.24));
        studentList.add(new Student(1,"Mussie","Math",90.1));
        studentList.add(new Student(4,"Efrem","Math",92.5));
        studentList.add(new Student(3,"Senay","Math",75.23));
        Optional<Student>secondHighestScore =studentList.stream().sorted(Comparator.comparingDouble(Student::getScore).reversed()).skip(3).findFirst();
        System.out.println(secondHighestScore.get().getName());

        Optional<Student>secondLowestScore=studentList.stream().sorted(Comparator.comparingDouble(Student::getScore)).skip(1).findFirst();

        Optional<Double> res = studentList.stream().map(Student::getScore).sorted(Comparator.reverseOrder()).skip(3).findFirst();
    }
}
