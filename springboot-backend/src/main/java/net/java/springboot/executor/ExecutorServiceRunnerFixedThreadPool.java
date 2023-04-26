package net.java.springboot.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunnerFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.execute(new Task1());
        es.execute(new Thread(new Task2()));
        es.shutdown();
    }
}
