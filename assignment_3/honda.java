package assignment_3;
import java.util.Scanner;

class Honda {
    int cost;
    int type;

    // Method to take cost and type input from the user
    void gettype() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the article: ");
        cost = sc.nextInt();
        System.out.print("Enter the type of the article (2 or 4): ");
        type = sc.nextInt();
    }

    // Method to calculate cost based on the type of article
    void find() {
        if (type == 2) {
            // Adding 10% to the cost for type 2
            cost += 0.1 * cost;
        } else if (type == 4) {
            // Adding 12% to the cost for type 4
            cost += 0.12 * cost;
        } else {
            // Handle invalid type input
            System.out.println("Invalid type. Please enter 2 or 4.");
        }
    }

    // Method to print the final cost and type
    void printcost() {
        System.out.println("Cost of the article: " + cost);
        System.out.println("Type of the article: " + type);
    }

    public static void main(String args[]) {
        Honda ob = new Honda();
        ob.gettype();  // Input cost and type
        ob.find();     // Calculate final cost based on type
        ob.printcost(); // Print the final cost and type
    }
}
