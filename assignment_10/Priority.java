package assignment_10;

class PT extends Thread {
    public PT(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 3; i >= 1; i--) {
            System.out.println(getName() + " is running. Priority: " + getPriority());
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        // Create three threads
        PT t1 = new PT("Low Priority Thread");
        PT t2 = new PT("Medium Priority Thread");
        PT t3 = new PT("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
