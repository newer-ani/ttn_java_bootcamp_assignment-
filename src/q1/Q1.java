package q1;

public class Q1 extends Thread{

    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread running using thread class: " + Thread.currentThread().getName());
        }
    }

class MyRunnable implements Runnable
{
    public void run()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);}

        System.out.println("Thread running using runnable interface: " + Thread.currentThread().getName());

    }
}
