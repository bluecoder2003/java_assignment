package assignment_10;

class Buffer {
    private int value = 0;
    private boolean isProduced = false;

    // Producer produces the value
    public synchronized void produce() throws InterruptedException {
        while (isProduced) wait();
        value = (int) (Math.random() * 100);
        System.out.println("Produced: " + value);
        isProduced = true;
        notify();  // Notify consumer
    }

    // Consumer consumes the value
    public synchronized void consume() throws InterruptedException {
        while (!isProduced) wait();
        System.out.println("Consumed: " + value);
        isProduced = false;
        notify();  // Notify producer
    }
}

public class Producer_Consumer{
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    buffer.produce();
                    Thread.sleep(1000);  // Sleep to simulate production time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    buffer.consume();
                    Thread.sleep(1500);  // Sleep to simulate consumption time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

