package assignment_4;

public class Population {
    private float p; // Initial population
    private float r; // Growth rate

    // Constructor to initialize population and growth rate
    public Population(int a, int b) {
        p = a; // Initial population
        r = b; // Growth rate
    }

    // Method to calculate and print the population for each year from 2001 to 2007
    public void print() {
        System.out.println("Year\tPopulation");
        for (int year = 2001; year <= 2007; year++) {
            p = p * (1 + r / 100); // Calculate population for the year
            System.out.printf("%d\t%.2f\n", year, p); // Print the year and the population
        }
    }

    public static void main(String[] args) {
        // Create an object of Population with initial population and growth rate
        Population population = new Population(1000000, 5); // Example: Initial population = 1,000,000, growth rate = 5%
        
        // Print the population for each year from 2001 to 2007
        population.print();
    }
}
