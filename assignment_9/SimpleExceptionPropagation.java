package assignment_9;

import java.util.Scanner;

public class SimpleExceptionPropagation {

    // Method that can throw an ArithmeticException
    public static void divide(int a, int b) throws ArithmeticException {
        // This will throw an exception if b is zero
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter numerator: ");
        int num = sc.nextInt();
        
        System.out.print("Enter denominator: ");
        int denom = sc.nextInt();

        try {
            // Calling the divide method which may throw an exception
            divide(num, denom);
        } catch (ArithmeticException e) {
            // Handle the exception if it occurs
            System.out.println("Error: " + e.getMessage());
        }
    }
}

