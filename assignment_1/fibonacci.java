import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println("Fibonacci series upto "+n+" terms is displayed above");
    }
}