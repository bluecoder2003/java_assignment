package assignment_10;

class Tp implements Runnable {
    private String message;

    public Tp(String message) {
        this.message = message;
    }

    @Override
    public void run() {
            System.out.println(message);
    }
}

public class Multithread {
    public static void main(String[] args) {

        Tp a = new Tp("Java is Hot, Java is Simple");
        Tp b = new Tp("Java is Multithreaded");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
