package net.java.springboot.extra.chatGPT;


import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {
        String stringInput="yonas";
        String reversedString= reverseString(stringInput);
        System.out.println("Reversed String :"+reversedString);
    }
    public static String reverseString(String input){

        char[] chars= input.toCharArray();
        char[] result= new char[chars.length];
        int j=0;

        System.out.println("Check :"+new String(chars));

        for (int i=chars.length-1; i>=0; i--){
            result[j]=chars[i];
            System.out.println(chars[i]);
            ++j;
        }
        return new String(result);
    }

    public static String reverseStringJava8(String input){

        char[] chars= input.toCharArray();
        char[] result= new char[chars.length];

//        String result= Arrays.stream(chars)


        return new String(result);
    }
}
