package net.java.springboot.extra.highest_salary.student;

public class Student {
    private int studNumber;
    private String name;
    private String subject;
    private double score;

    public Student() {
    }

    public Student(int studNumber, String name, String subject, double score) {
        this.studNumber = studNumber;
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public int getStudNumber() {
        return studNumber;
    }

    public void setStudNumber(int studNumber) {
        this.studNumber = studNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNumber=" + studNumber +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
