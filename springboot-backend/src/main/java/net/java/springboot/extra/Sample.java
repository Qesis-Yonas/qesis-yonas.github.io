package net.java.springboot.extra;

import java.util.Arrays;

public class Sample {



    /*
    Coding
EAT ATE TEA CAT RAT
Group together the word which are in the same character
Grp 1 ( EAT ATE TEA)
Grp 2 ( CAT)
Grp 3 (RAT )
     */

    public static void isAnagram(String[] str){
     int n = str.length;
     for(int i=0; i<n; i++){
         if(str[i].length() == 0) continue;;
         boolean[] c = new boolean[26];
         for(int j=0; j<str[i].length(); j++){
             c[str[i].charAt(j)-'a'] = true;
         }
         for(int k=i; k<n; k++ ){
             boolean[] c2 = new boolean[26];
             for(int l=0; l<str[k].length(); l++){
                 c2[str[k].charAt(l)-'a'] = true;
             }
             if(Arrays.equals(c2,c)){
                 System.out.println(str[k]+ ", ");
                 str[k]="";
             }
         }
         System.out.println();
     }
     return;
    }
    public static void main(String[] args){
    String[] a = {"EAT","ATE","TEA","CAT","RAT"};
        isAnagram(a);
    }
}
