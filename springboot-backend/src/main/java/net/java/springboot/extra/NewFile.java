package net.java.springboot.extra;

public class NewFile {
    public static boolean isPalindrom(String str){
        if(str.length()==0||str.length()==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrom(str.substring(1,str.length()-1));
        }
        return false;
    }
    public static void main(String[] args){
        boolean pal=isPalindrom("abcba");
        if(pal==true){
            System.out.println("The String is Palindrom");
        }
    }
}
