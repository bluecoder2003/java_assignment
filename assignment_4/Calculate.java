package assignment_4;

public class Calculate {
    private int num;
    // private int f;
    private int rev;

    public Calculate(int n)
    {
        num=n;
        // f=0;
        rev=0;
    }
    public int prime()
    {
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) return 0;  // Not prime if divisible by any number other than 1 and itself
        }
        return 1;
    }
    public int reverse()
    {
        int n1=num;
        while(n1>0)
        {
            int m=n1%10;
            rev=rev*10+m;
            n1=n1/10;
        }
        return rev;
    }
    public void display(){
        int isPrime = prime();
        int reversedNum = reverse();
        if (isPrime == 1 && num == reversedNum) {
            System.out.println(num + " is a prime palindrome.");
        } else if (isPrime == 1) {
            System.out.println(num + " is prime but not a palindrome.");
        } else if (num == reversedNum) {
            System.out.println(num + " is a palindrome but not prime.");
        } else {
            System.out.println(num + " is neither prime nor a palindrome.");
        }
    }

    public static void main(String[] args) {
        Calculate ob = new Calculate(101);
        ob.display();
    }
}
