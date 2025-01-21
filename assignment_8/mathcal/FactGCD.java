package assignment_8.mathcal;

public class FactGCD {
    public int calFactorial(int n)
    {
        int f=1;
        for(int i=1;i<n;i++)
        {
            f=f*i;
        }
        return fact;
    }
    public int calGCD(int a,int b)
    {
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd = i;
            }
        }
        return gcd;
    }
}
