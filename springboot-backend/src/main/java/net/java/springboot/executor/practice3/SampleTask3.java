package net.java.springboot.executor.practice3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleTask3 extends Thread{
    private String taskName;

    public SampleTask3(String taskName) {
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
        return "SampleTask3{" +
                "taskName='" + taskName + '\'' +
                '}';
    }

    public void run(){
        System.out.println("Execution "+taskName+" Started");
        int rand=(int)(Math.random())*10;
        System.out.println("Printing Random Number "+rand+" Of "+ taskName);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended Excution of "+taskName);
    }
}

class Main{
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            SampleTask3 st3=new SampleTask3("Task"+i);
            es.execute(st3);
        }
        es.shutdown();
    }
}
