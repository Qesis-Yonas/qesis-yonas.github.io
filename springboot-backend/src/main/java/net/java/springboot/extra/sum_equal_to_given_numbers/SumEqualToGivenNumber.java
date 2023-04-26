package net.java.springboot.extra.sum_equal_to_given_numbers;

import java.util.Arrays;

public class SumEqualToGivenNumber {
    public static void main(String[] args) {
        SumEqualToGivenNumber segn= new SumEqualToGivenNumber();
        int[] arr=new int[]{1,5,7,-1};
        //-3,-1,1,2,3,4,5,7,9,10
        int sum=6;
//        String res=
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length; j++){
                int temp=arr[i]+arr[j];
                if(sum==temp){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }

        }
    }



}
