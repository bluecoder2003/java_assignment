package assignment_9;

import java.util.Scanner;

public class EasyMultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Outer try block to get user input for numerator
            System.out.print("Enter a number to divide: ");
            int num1 = sc.nextInt();

            try {
                // Inner try block to get user input for denominator
                System.out.print("Enter another number to divide by: ");
                int num2 = sc.nextInt();

                // Try to perform division
                int result = num1 / num2;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                // Catches division by zero
                System.out.println("Error: Cannot divide by zero.");
            }

        }
        catch (java.util.InputMismatchException e) {
            // Catches invalid input (not an integer)
            System.out.println("Error: Invalid input, please enter an integer.");
        }
        finally {
            // Always runs to clean up resources
            System.out.println("This is the finally block.");
            sc.close();
        }
    }
}

