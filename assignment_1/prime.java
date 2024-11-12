import java.util.*;
class prime
{
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}