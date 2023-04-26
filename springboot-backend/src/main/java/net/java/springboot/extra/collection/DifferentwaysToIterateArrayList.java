package net.java.springboot.extra.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentwaysToIterateArrayList {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Yonas","Efrem","Mussie","senay");
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println(names.toString());

        Iterator iter= names.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter);
//            names=iter.next();
//        }
    }
}
