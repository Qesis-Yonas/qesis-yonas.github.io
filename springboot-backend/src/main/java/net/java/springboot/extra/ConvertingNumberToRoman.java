package net.java.springboot.extra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertingNumberToRoman {
    public static void main(String[] args) {

        int[] a = {1,3,4,3,2,5,5,4,9};
        int[] b = {3,2,4,4,3,7,8,6,3,1,2};

        System.out.println(findIntersection(a,b));

    }

    public static List<Integer> findIntersection(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : a ) {
            set1.add(num);
        }
        for(int num2 : b) {
            set2.add(num2);
        }

        for(int x : set1){
            if(set2.contains(x)) {
                al.add(x);
            }
        }
        return al;


    }
}
