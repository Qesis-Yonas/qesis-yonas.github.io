package net.java.springboot.executor;

class Task1 extends Thread{
    public void run(){
        System.out.println("*******Task1 statrted********");
        for(int i=101;i<199;i++)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("*******Task1 ended*******");
    }

}

class Task2 implements Runnable{
    @Override
    public void run(){
        System.out.println("*******Task2 statrted********");
        for(int i=701;i<799;i++)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("*****Task2 ended*****");
    }
}
