package practice1;

class A implements Runnable
{
    private int num;
    public A(int num)
    {
        this.num=num;
    }
    @Override
    public void run()
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class B implements Runnable
{
    private int num1;
    private int num2;
    public B(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public void run()
    {
        int gcd=1;
        for(int i=1;i<=num1 && i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

public class p2 {
    public static void main(String [] args)
    {
        A fact = new A(5);
        B gcd = new B(20,30);
        Thread t1=new Thread(fact);
        Thread t2=new Thread(gcd);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
