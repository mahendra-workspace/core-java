package Multithreading;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer producer1 = new Producer(resource);
        Producer producer2 = new Producer(resource);
        Consumer consumer1 = new Consumer(resource);
        Consumer consumer2 = new Consumer(resource);

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();

        try {
            producer1.join();
            producer2.join();
            consumer1.join();
            consumer2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished execution.");
    }
}

