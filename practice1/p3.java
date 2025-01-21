package practice1;

class Task implements Runnable
{
    @Override
    public void run() {
        for (int i = 3; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + " is running. Priority: " + Thread.currentThread().getPriority());
        }
    }
}

public class p3 {
    public static void main(String[] args) {
        Task t1 = new Task();  // Low Priority Thread
        Task t2 = new Task();  // Medium Priority Thread
        Task t3 = new Task();  // High Priority Thread

        Thread r1 = new Thread(t1, "Low Priority Thread");
        Thread r2 = new Thread(t2, "Medium Priority Thread");
        Thread r3 = new Thread(t3, "High Priority Thread");

        r1.setPriority(Thread.MIN_PRIORITY);
        r2.setPriority(Thread.NORM_PRIORITY);  
        r3.setPriority(Thread.MAX_PRIORITY);

        r1.start();
        r2.start();
        r3.start();

        try {
            r1.join();  // Wait for r1 to finish
            r2.join();  // Wait for r2 to finish
            r3.join();  // Wait for r3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
