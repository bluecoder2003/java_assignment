package assignment_5;

// Account class
class Account {
    int acno;
    float balance;

    // Constructor to initialize account number and balance
    public Account(int a, float b) {
        acno = a;
        balance = b;
    }

    // Method to withdraw an amount from balance
    public void withdraw(int w) {
        if (w <= balance) {
            balance -= w;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to deposit an amount to balance
    public void deposit(int d) {
        balance += d;
        System.out.println("Deposit successful. New balance: " + balance);
    }
}

// Calculate class that inherits from Account
class Calculate extends Account {
    int r, t;       // rate of interest and time period
    float si, amt;  // simple interest and total amount

    // Constructor to initialize account details using superclass constructor
    public Calculate(int a, float b) {
        super(a, b);
    }

    // Method to initialize interest rate and time
    public void accept(int x, int y) {
        r = x;
        t = y;
        amt = 0;
    }

    // Method to compute simple interest and total amount
    public void compute() {
        si = (balance * r * t) / 100;
        amt = balance + si;
    }

    // Method to display account details, balance, interest, and total amount
    public void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + si);
        System.out.println("Total Amount: " + amt);
    }
}

// Main class to test the Account and Calculate classes
public class Main {
    public static void main(String[] args) {
        // Creating an object of Calculate class with account number and balance
        Calculate calc = new Calculate(101, 1000);

        // Performing some operations
        calc.deposit(500);      // Depositing amount
        calc.withdraw(300);     // Withdrawing amount

        // Accepting interest rate and time, then computing interest and amount
        calc.accept(5, 2);      // 5% interest rate and 2 years
        calc.compute();

        // Displaying all details
        calc.display();
    }
}
