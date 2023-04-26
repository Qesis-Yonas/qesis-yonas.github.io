package net.java.springboot.executor.practice5;

import java.util.List;
import java.util.concurrent.*;

public class SampleTask5 implements Callable<String> {
    private String taskName;

    public SampleTask5(String taskName) {
        this.taskName = taskName;
    }


    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Compeleted "+ taskName;
    }
}

class Main{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es5= Executors.newFixedThreadPool(1);
        Future<String> future=es5.submit(new SampleTask5("Task Yonas"));
        String result=future.get();
        System.out.println(result);

        List<SampleTask5> task5List=List.of(new SampleTask5("Task Efrem"),new SampleTask5("Task Mussie"),new SampleTask5("Task Senay"));
        List<Future<String>> futureList=es5.invokeAll(task5List);
        for(Future<String> res:futureList){
            Thread.sleep(2000);
//            while(!res.isDone()){
//                System.out.println(res.get()+"\n NextTask In Progress");
//            }
            System.out.println(res.get());
        }





        es5.shutdown();
    }
}
