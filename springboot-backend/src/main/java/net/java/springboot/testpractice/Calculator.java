package net.java.springboot.testpractice;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class Calculator {

//    private int i;
//    private int j;
//

    public int add(int i, int j){
        return i+j;
    }
    public int subtract(int i, int j){
        return i-j+1;
    }
}
