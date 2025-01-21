package assignment_8;

import mathcal.FactGCD;
import mathcal.mathcheck.Prime;

public class Calculations {
    public static void main(String[] args) {
        // Create an instance of FactGCD
        FactGCD factGCD = new FactGCD();

        // Calculate and display the factorial of a number
        int factorial = factGCD.calFactorial(5);
        System.out.println("Factorial of 5: " + factorial);

        // Calculate and display the GCD of two numbers
        int gcd = factGCD.calGCD(56, 98);
        System.out.println("GCD of 56 and 98: " + gcd);

        // Create an instance of Prime
        Prime prime = new Prime();

        // Check if a number is prime
        boolean isPrime = prime.isPrime(29);
        System.out.println("Is 29 a prime number? " + isPrime);
    }
}
