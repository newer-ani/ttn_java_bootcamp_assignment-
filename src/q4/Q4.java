package q4;

import java.util.Random;
import java.util.concurrent.*;

public class Q4 {

    public static void main(String[] args) {
        try(ExecutorService executor = Executors.newSingleThreadExecutor();) {
            Callable<Integer> task = () -> {
                Random random = new Random();
                int value = random.nextInt();
                return value;
            };
            Future<Integer> future = executor.submit(task);
            Integer result = future.get(); // Blocks until result is available
            System.out.println("Returned from Future: " + result);
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
