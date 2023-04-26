package net.java.springboot.executor.practice4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleTask4 extends Thread{
    private String taskName;

    public SampleTask4(String taskName) {
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

}

class Main4{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(2);

        Future<String> future=es.submit(()->{
            Thread.sleep(5000);
            System.out.println("Get ready Yonas for result");
            return "Execution Time For future is up";
        });

        try{
            while (!future.isDone()){
                Thread.sleep(500);
                System.out.println("Wait future is in Progress");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Execution completed");
        String result=future.get();
        System.out.println(result);
        es.shutdown();
    }
}

