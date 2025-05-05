package com.ibm.threadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Application {
    public static void main(String[] args) {
        // 1. Get available processors (vCPUs)
        int vCPUs = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors (vCPUs): " + vCPUs);

        // 2. Create a fixed thread pool with vCPUs size
        ExecutorService service = Executors.newFixedThreadPool(vCPUs);

        // 3. Submit 10 tasks to the thread pool
        for (int counter = 0; counter < 10; counter++) {
            service.execute(new Task(counter));
            try {
            	Thread.sleep(10);
            }catch(InterruptedException e) {
            	e.printStackTrace();
            }
        }

        // 4. Shutdown the executor (no new tasks will be accepted)
        service.shutdown();
    }
    // 5. Task class implementing Runnable
    static class Task implements Runnable {
        int count;
        Task(int count) {
            this.count = count;
        }
        @Override
        public void run() {
            System.out.println("Task " + count + " is executed by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulating a time-consuming task
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Task " + count + " was interrupted");
            }
            System.out.println("Task " + count + " completed by " + Thread.currentThread().getName());
        }
    }
}
