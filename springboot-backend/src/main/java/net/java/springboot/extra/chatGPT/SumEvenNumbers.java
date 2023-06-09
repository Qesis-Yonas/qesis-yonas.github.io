package net.java.springboot.extra.chatGPT;

import java.util.Arrays;

public class SumEvenNumbers {

    public static void main(String[] args) {
        int[] numbers={5,4,7,2,8,3};

        int result= findSumOfEvenNumber(numbers);
        int resultJava8= findSumOfEvenNumberJava8(numbers);
        System.out.println("Result :"+result);
        System.out.println("Result using Java8:"+resultJava8);

    }

    public static int findSumOfEvenNumber(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]%2==0) {
                sum = sum + input[i];
            }
        }
        return sum;
    }

    public static int findSumOfEvenNumberJava8(int[] input) {

        return Arrays.stream(input)
                .filter(x->(x%2==0))
                .sum();
    }
}
