package Thread;

public class ThreadNameExample {
    public static void main(String[] args) {
        // Create and start a thread
        Thread thread = new MyThread();
        thread.start();

        // Get the name of the running thread
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread name: " + threadName);
    }
}

// Custom thread class
class MyThread extends Thread {
    public void run() {
        // Get the name of the running thread
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName);
    }
}
