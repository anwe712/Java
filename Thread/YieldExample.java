package Thread;

public class YieldExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

// Custom thread class
class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set thread name
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Print thread name and value of i
            System.out.println(Thread.currentThread().getName() + ": " + i);
            
            // Yield control to other threads after printing each value of i
            Thread.yield();
        }
    }
}
