package net.java.springboot.executor.practice1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleTaskMain {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(3);

        for(int i=1; i<=5; i++){
            SampleTask st=new SampleTask("Task "+i);
            es.execute(st);
        }
        es.shutdown();
    }
}
