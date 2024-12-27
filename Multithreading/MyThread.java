package Multithreading;

public class MyThread extends Thread{
    private String threadName;

    MyThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating Thread: "+ threadName);
    }

    public void run(){
        System.out.println("Running thread: "+ threadName);
        try{
            for(int i=1; i<=10; i++){
                System.out.println(threadName+"-count: "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+ threadName+" interrubpted");
        }
        System.out.println("Thread "+threadName+" exiting...");
    }

    public void start(){
        System.out.println("Starting Thread:"+ threadName+"...");
        super.start();
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        t1.start();
        MyThread t2 = new MyThread("Thread-2");
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.println("Main Thread interrupted...");
        }

        System.out.println("All thread have finished execution.");
    }
}
