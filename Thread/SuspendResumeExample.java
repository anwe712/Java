package Thread;

public class SuspendResumeExample {
    public static void main(String[] args) {
        // Create a custom thread
        MyThread thread = new MyThread("MyThread");

        // Start the thread
        thread.start();

        try {
            // Sleep for 2 seconds to allow the thread to start
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Suspend the thread
        System.out.println("Suspending thread...");
        thread.suspendThread();

        try {
            // Sleep for 2 seconds to observe the effect of suspension
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Resume the thread
        System.out.println("Resuming thread...");
        thread.resumeThread();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}

// Custom thread class
class MyThread extends Thread {
    private boolean suspended;

    public MyThread(String name) {
        super(name);
        this.suspended = false;
    }

    public synchronized void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    public synchronized void run() {
        System.out.println(getName() + " starting");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + ": " + i);

                // Check if the thread is suspended
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }

                // Sleep for 1 second
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }

        System.out.println(getName() + " exiting");
    }
}
