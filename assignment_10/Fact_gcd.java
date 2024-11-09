package assignment_10;

class FactorialCalculator implements Runnable
{
    private int number;
    public FactorialCalculator(int number){
        this.number = number;
    }
    @Override
    public void run()
    {
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class GCDCalculator implements Runnable
{
    private int number1;
    private int number2;
    public GCDCalculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    @Override
    public void run()
    {
        int gcd=1;
        for(int i=1;i<=number1 && i<=number2;i++)
        {
            if(number1%i==0 && number2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD of " + number1 + " and " + number2 + " is " + gcd);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Fact_gcd {
    public static void main(String[] args) {
        Thread fact = new Thread(new FactorialCalculator(5));
        Thread gcd= new Thread(new GCDCalculator(30, 45));
        fact.start();
        gcd.start();
    }

}
