package assignment_10;

class A extends Thread { // Removed @Override annotation
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A t = new A();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B");
            // Thread.sleep(1000);
        }
    }
}
