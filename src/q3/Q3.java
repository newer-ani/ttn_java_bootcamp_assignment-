package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            tasks.add(() -> {
                String threadName = Thread.currentThread().getName();
                return "Task " + taskId + " executed by " + threadName;
            });
        }

        System.out.println("\n Using SingleThreadExecutor ");
        runTask(Executors.newSingleThreadExecutor(), tasks);

        System.out.println("\n Using FixedThreadPool (3 threads) ");
        runTask(Executors.newFixedThreadPool(3), tasks);

        System.out.println("\n Using CachedThreadPool ");
        runTask(Executors.newCachedThreadPool(), tasks);

    }

    private static void runTask(ExecutorService executor, List<Callable<String>> tasks) throws InterruptedException {
        try {
            List<Future<String>> results = executor.invokeAll(tasks);
            for (Future<String> result : results) {
                try {
                    System.out.println(result.get());
                } catch (ExecutionException e) {
                    System.err.println("Task failed: " + e.getMessage());
                }
            }
        } finally {
            executor.shutdown();
        }
    }
}


