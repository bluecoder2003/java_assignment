package assignment_4;
import java.util.Scanner;
class overload_discount {
    public static double discount(int price,int a)
    {
        return (price-(price*a/100));
    }
    public static double discount(int price,int a,int b)
    {
        double priceAfterFirstDiscount = discount(price, a);
        return priceAfterFirstDiscount-(priceAfterFirstDiscount*b/100);
    }
    public static double discount(int price,int a,int b,int c)
    {
        double priceAfterSecondDiscount = discount(price, a, b);
        return priceAfterSecondDiscount-(priceAfterSecondDiscount*c/100);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        System.out.print("Enter the number of discounts (1, 2, or 3): ");
        int discount=sc.nextInt();
        double finalAmount=0.0;
        if (discount == 1) {
            System.out.print("Enter discount percentage: ");
            int discount1 = sc.nextInt();
            finalAmount = discount(price, discount1);
        }
        else if (discount == 2) {
            System.out.print("Enter discount percentage: ");
            int discount1 = sc.nextInt();
            int discount2 = sc.nextInt();
            finalAmount = discount(price,discount1,discount2);
        }
        else if (discount == 3) {
            System.out.print("Enter discount percentage: ");
            int discount1 = sc.nextInt();
            int discount2 = sc.nextInt();
            int discount3 = sc.nextInt();
            finalAmount = discount(price,discount1,discount2,discount3);
        }
        else {
            System.out.println("Invalid number of discounts.");
            return;
        }
        System.out.println("Amount to be paid after discounts: ₹" + finalAmount);
        sc.close();
    }
}
