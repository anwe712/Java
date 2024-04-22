package Thread;
public class PriorityThreadExample {
    public static void main(String[] args) {
        // Create and start threads with different priorities
        Thread thread1 = new CounterThread("Thread 1", 1);
        Thread thread2 = new CounterThread("Thread 2", 3);
        Thread thread3 = new CounterThread("Thread 3", 5);
        Thread thread4 = new CounterThread("Thread 4", 7);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final values of the counters
        System.out.println("Final count for Thread 1: " + ((CounterThread) thread1).getCount());
        System.out.println("Final count for Thread 2: " + ((CounterThread) thread2).getCount());
        System.out.println("Final count for Thread 3: " + ((CounterThread) thread3).getCount());
        System.out.println("Final count for Thread 4: " + ((CounterThread) thread4).getCount());
    }
}

// Custom thread class
class CounterThread extends Thread {
    private int count;

    public CounterThread(String name, int priority) {
        super(name);
        setPriority(priority); // Set thread priority
        count = 0;
    }

    public void run() {
        try {
            // Update counter for 10 milliseconds
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }
}
