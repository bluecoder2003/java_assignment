package practice1;

class A implements Runnable{
    private String message;
    public A(String message)
    {
        this.message=message;
    }
    @Override
    public void run()
    {
        System.out.println(message);
    }
}

public class p1 {

    public static void main(String[] args) {
        A a = new A("Java is Hot, Java is Simple");
        A b = new A("Java is Multithreaded");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
    
}

