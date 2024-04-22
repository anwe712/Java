package Thread;

// Class extending Thread class
class MyThread extends Thread {
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
public class ThreadExample {
    public static void main(String[] args) {
        // Creating an object of MyThread class
        MyThread thread = new MyThread();
        
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
