package net.java.springboot.extra.highest_salary.sum_of_even_numbers;

import java.util.stream.IntStream;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int result=sumEvenNum(1,200);
        System.out.println(result);
    }
    public static int sumEvenNum(int x, int y){
        return IntStream.rangeClosed(x,y).filter(number->number%2==0).sum();
    }
}
