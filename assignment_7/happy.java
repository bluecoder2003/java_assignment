package assignment_7;
import java.util.Scanner;

public class happy {

    // Method to compute the sum of the squares of the digits of a number
    static int numSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);  // Square the last digit and add to squareSum
            n /= 10;                            // Remove the last digit
        }
        return squareSum;  // Return the computed sum
    }

    // Method to check if a number is a Happy number
    static boolean isHappynumber(int n) {
        int slow, fast;

        // Initialize slow and fast pointers
        slow = fast = n;
        do {
            // Move slow number by one iteration
            slow = numSquareSum(slow);

            // Move fast number by two iterations
            fast = numSquareSum(numSquareSum(fast));

        } while (slow != fast);

        // If both meet at 1, then it is a Happy number
        return (slow == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String s = sc.nextLine().toUpperCase(); 
        char[] ch=s.toCharArray();
        int pos=0;
        String concatenated="";
        for(char c: ch)
        {
            pos =c-'A'+1;
            concatenated+=pos;
        }
        int n = Integer.parseInt(concatenated);

        if (isHappynumber(n))
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a Happy number");
    }
}
