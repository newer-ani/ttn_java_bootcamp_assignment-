package q3;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {

            VolatileUsage task = new VolatileUsage();
            Thread thread = new Thread(task);
            thread.start();

        Thread.sleep(1000);
        task.running = false;
        System.out.println("Main thread updated running to false.");

        }
    }

class VolatileUsage implements Runnable{

    volatile boolean running = true;
    public void run() {

        System.out.println("thread started");
        while(running)
        {
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("thread stopped");
    }
}
