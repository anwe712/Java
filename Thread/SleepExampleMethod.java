package Thread;

public class SleepExampleMethod {
    public static void main(String[] args) {
        // Create a custom thread
        Thread thread = new MyThread("MyThread");

        // Start the thread
        thread.start();
    }
}

// Custom thread class
class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set thread name
    }

    public void run() {
        try {
            // Thread's job
            for (int i = 1; i <= 5; i++) {
                // Print thread name and value of i
                System.out.println(Thread.currentThread().getName() + ": " + i);
                
                // Pause the execution of the thread for 1 second
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }

}
