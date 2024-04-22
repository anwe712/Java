package Thread;

public class ThreadAliveExample {
    public static void main(String[] args) {
        // Create a thread
        Thread thread = new MyThread();

        // Start the thread
        thread.start();

        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is alive");
        } else {
            System.out.println("Thread is not alive");
        }

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check again if the thread is alive after it has finished
        if (thread.isAlive()) {
            System.out.println("Thread is alive");
        } else {
            System.out.println("Thread is not alive");
        }
    }
}

// Custom thread class
class MyThread extends Thread {
    public void run() {
        // Perform some task
        try {
            Thread.sleep(3000); // Simulate some task that takes time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
