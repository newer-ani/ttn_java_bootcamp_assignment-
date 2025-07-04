package q2;

public class Q2{

    public static void main(String[] args) {

        Thread thread = new Thread(new SynchronizationUsage());
        Thread thread2 = new Thread(new SynchronizationUsage());
        thread.start();
        thread2.start();

    }
}

class SynchronizationUsage implements Runnable{

    int count = 0;
    int count2 = 0;

    public synchronized void incrementCount() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
    }

    public void incrementCount2() {

        synchronized (this) {
            count2++;
            System.out.println(Thread.currentThread().getName() + " incremented count2 to " + count2);
        }
    }


    public void run() {

        for (int i = 0; i < 5; i++) {
            incrementCount();
            incrementCount2();
        }
    }
}
