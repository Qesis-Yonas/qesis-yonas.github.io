package net.java.springboot.executor.practice2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleTask2 implements Runnable{
    private String taskName;

    public SampleTask2(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "SampleTask2{" +
                "taskName='" + taskName + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Execution of "+taskName+ " Started");
        try{
            Thread.sleep(5000);
            int rand=(int)(Math.random())*20;
            System.out.println("Printing Random Number "+rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName+" Ended");
    }
}

class Main{
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(3);
        for(int i=0;i<=5;i++) {
            SampleTask2 st2 = new SampleTask2("Task "+ i);
            es.execute(st2);
        }
        es.shutdown();
    }
}