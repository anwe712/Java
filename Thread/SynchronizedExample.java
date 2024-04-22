package Thread;

public class SynchronizedExample {
    public static void main(String[] args) {
        // Create a shared object
        SharedObject sharedObject = new SharedObject();

        // Create and start multiple threads accessing the shared object
        Thread thread1 = new MyThread("Thread 1", sharedObject);
        Thread thread2 = new MyThread("Thread 2", sharedObject);

        thread1.start();
        thread2.start();
    }
}

// Shared object class
class SharedObject {
    // Method to perform synchronized operation
    public void synchronizedOperation(String threadName) {
        // Synchronized block ensures that only one thread can execute this block at a time
        synchronized (this) {
            System.out.println(threadName + " entering synchronized block");
            try {
                // Simulate some task that takes time
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " exiting synchronized block");
        }
    }
}

// Custom thread class
class MyThread extends Thread {
    private SharedObject sharedObject;

    public MyThread(String name, SharedObject sharedObject) {
        super(name);
        this.sharedObject = sharedObject;
    }

    public void run() {
        // Call the synchronized operation on the shared object
        sharedObject.synchronizedOperation(getName());
    }
}
