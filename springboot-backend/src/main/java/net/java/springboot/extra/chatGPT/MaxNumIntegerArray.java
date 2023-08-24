package net.java.springboot.extra.chatGPT;

import java.util.Arrays;

public class MaxNumIntegerArray {

    //Ques: Write a Java program that finds the maximum element in an array of integers.
    public static void main(String[] args) {


        int[] test={2,5,1,3,8,4,9};
        int result=findMaxInteger(test);
        int resultJava8=findMaxIntegerJava8(test);
        System.out.println("result :"+result);
        System.out.println("result of Java8 :"+resultJava8);
        System.out.println("Size of the Array test :"+test.length);
    }
    public static int findMaxInteger(int[] input){
        int max= input[0];
         for(int i=1; i<input.length; i++){
             if (input[i]>max){
                 max=input[i];
             }

         }
        return max;
    }

    public static int findMaxIntegerJava8(int[] input){
        return Arrays.stream(input)
                .max()
                .orElseThrow(()-> new IllegalArgumentException("Array is empty"));
    }
}
