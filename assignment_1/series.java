import java.util.Scanner;

public class series {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get values for x and n
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sum = 0.0;
        int fact = 0;

        for(int i=1;i<=n;i++)
        {
            int exp=2*i;
            fact=factorial(exp);
            sum+=Math.pow(x,exp)/fact;
        }

        System.out.println("Sum of the series is: "+sum);
   
    }
}
