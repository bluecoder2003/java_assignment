package practice1;

class Counter {
    private int item = 0;
    private boolean empty = true;

    public synchronized void produce(int value)
    {
        while(!empty)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        item = value;
        empty = false;
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized void consume()
    {
        while(empty)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + item);
        empty = true;
        notify();
    }

}

public class p5 {
    public static void main(String[] args) throws InterruptedException
    {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    counter.produce(i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    counter.consume();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
