package q1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q1 {
    public static void main(String[] args)  {

        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        try(  ExecutorService executor = Executors.newSingleThreadExecutor();){

            Future<String> future = executor.submit(new MyCallable());
            String result = future.get();
            System.out.println("Callable returned: " + result);
        }
        catch(Exception e)
        {
            System.out.println("from catch");
        }
    }
}
class MyCallable implements Callable<String> {

    public String call()
    {
        return "from callable";
    }
}

class MyRunnable implements Runnable {

    public void run()
    {
        System.out.println("from runnable");
    }

}
