package q5;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q5 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" shutdown() demo ");
        shutdownDemo();

        System.out.println("\n shutdownNow() demo ");
        shutdownNowDemo();

    }

    private static void shutdownDemo() throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(()->{
            System.out.println("Task 1 running ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Task was interrupted");;
            }
         System.out.println("task completed");
        });

        executor.submit(() -> {
            System.out.println("Task 2 running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("task was interrupted");
            }
            System.out.println("Task 2 finished");
        });

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }

    private static void shutdownNowDemo() throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(()->{
            System.out.println("Task A running ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task A completed");
        });

        executor.submit(()->{
            System.out.println("Task A running ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task A completed");
        });

        Thread.sleep(1000); // Let tasks start
        List<Runnable> notStarted = executor.shutdownNow(); // Force shutdown

        System.out.println("shutdownNow called. Pending tasks: " + notStarted.size());
    }
}
