package assignment_4;

import java.util.Scanner;

class laptop {
    private String name;
    private double price;
    private double discount;
    private double amount;

     // Parameterized constructor to initialize name and price
    public laptop(String name, double price) {
        this.name = name;
        this.price = price;
        computeDiscount(); // Calculate discount based on price
    }

    private void computeDiscount() {
        if (price <= 25000) {
            discount = price * 0.05;
        } else if (price <= 50000) {
            discount = price * 0.075;
        } else if (price <= 100000) {
            discount = price * 0.10;
        } else {
            discount = price * 0.15;
        }
        amount = price - discount; // Final amount after discount
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Amount to be paid after discount: ₹" + amount);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter laptop price: ");
        double price = sc.nextDouble();
        laptop ob = new laptop(name,price);
        ob.display();
    }
}
