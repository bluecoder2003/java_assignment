import java.util.Scanner;

class Discount {
    int cost; 
    String name;
    double dc; // discount amount
    double amt; // amount to be paid after discount

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of the article and name of the customer:");
        cost = sc.nextInt();
        name = sc.next();
    }

    void cal() {
        // Calculate discount based on cost, not amt
        if (cost < 5000) {
            dc = 0.0;
        } else if (cost >= 5001 && cost <= 10000) {
            dc = 0.1 * cost;
        } else if (cost >= 10001 && cost <= 15000) {
            dc = 0.15 * cost;
        } else {
            dc = 0.2 * cost;
        }
        amt = cost - dc; // Calculate amount after applying discount
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Cost of the article: " + cost);
        System.out.println("Discount: " + dc);
        System.out.println("Amount to be paid: " + amt);
    }

    public static void main(String args[]) {
        Discount ob = new Discount();
        ob.input();
        ob.cal();
        ob.display();
    }
}
