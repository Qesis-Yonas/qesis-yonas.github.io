package net.java.springboot.executor.practice1;

public class SampleTask extends Thread {
    private String taskName;

    public SampleTask(String taskName) {
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
        return "SampleTask{" +
                "taskName='" + taskName + '\'' +
                '}';
    }

    @Override
    public void run(){
        System.out.println("Executing "+ taskName+ " Started");
        try {
            Thread.sleep(10000);
            int rand = (int)(Math.random()*15);

            System.out.println("Printing Random Number "+rand+ " From "+taskName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(taskName+ " Has Ended");
    }
}
