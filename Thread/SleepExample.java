package Thread;

public class SleepExample {
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
            try {
                // Print thread name and value of i
                System.out.println(Thread.currentThread().getName() + ": " + i);
                
                // Pause the execution of the thread for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
    }
}
