package Multithreading;

public class SharedResource {
    private int counter = 0;
    private boolean isAvailable  = false;

    public synchronized void increment(){
        while(isAvailable){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted!");
            }
        }
        counter++;
        isAvailable= true;
        System.out.println(Thread.currentThread().getName()+" increamented counter to: "+counter);
        notifyAll();
    }

    public synchronized void read(){
        while (isAvailable) {
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println(("Thread interrupted!"));
            }
        }

        System.out.println(Thread.currentThread().getName()+"Read counter: "+counter);
        isAvailable = false;
        notifyAll();
    }



}
