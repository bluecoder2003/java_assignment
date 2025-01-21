package practice2;
import java.util.Scanner;

class InvalidVoterAgeException extends RuntimeException{
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("enter age");
            int age=sc.nextInt();
            checkvoter(age);
        }
        catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Enter your current balance: ");
            int balance = sc.nextInt();
            System.out.print("Enter amount to withdraw: ");
            int withdrawal = sc.nextInt();
            withdrawAmount(balance, withdrawal);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
    static void checkvoter(int age)
    {
        if (age < 18) {
            throw new InvalidVoterAgeException("Must be 18 or older to vote.");
        }
        System.out.println("Can cast vote.");
    }
    static void withdrawAmount(int balance,int withdrawal)
    {
        if ((balance - withdrawal) < 5000) {
            throw new InsufficientBalanceException("Must be more than 5000");
        }
        System.out.println("withdraw successful");
    }
}
