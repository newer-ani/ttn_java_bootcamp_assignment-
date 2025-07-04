package q1;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {

        Q1 t1 = new Q1(); //using thread class
        t1.start();

        MyRunnable t2 = new MyRunnable();
        Thread thread = new Thread(t2); //using the  runnable interface
        thread.start();

        t1.join();

    }

}
