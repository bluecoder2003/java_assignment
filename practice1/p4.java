package practice1;

class Counter {
    private int count=0;

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public int getCount()
    {
        return count;
    }
}

public class p4 {
    public static void main(String[] args) throws InterruptedException
    {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
                System.out.println("Final count after incrementing: " + counter.getCount());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.decrement();
                }
                System.out.println("Final count after decrementing: " + counter.getCount());
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
