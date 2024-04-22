package Thread;

// Class implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        // Thread's job
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread executing: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Main class
public class RunnableThreadExample {
    public static void main(String[] args) {
        // Creating an object of MyRunnable class
        MyRunnable myRunnable = new MyRunnable();
        
        // Creating a thread and passing MyRunnable object as parameter
        Thread thread = new Thread(myRunnable);
        
        // Start the thread
        thread.start();

        // Main thread's job
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread executing: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
