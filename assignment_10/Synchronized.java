package assignment_10;
class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safety for incrementing the count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to ensure thread-safety for decrementing the count
    public synchronized void decrement() {
        count--;
    }

    // Getter for the count
    public int getCount() {
        return count;
    }
}

public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Thread to increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Final count after incrementing: " + counter.getCount());
        });

        // Thread to decrement the counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
            System.out.println("Final count after decrementing: " + counter.getCount());
        });

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();
    }
}
