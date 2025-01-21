package assignment_8.samepackage;

public class ClassA {
    private int privateVar = 10;

    // Default field
    int defaultVar = 20;

    // Protected field
    protected int protectedVar = 30;

    // Public field
    public int publicVar = 40;

    // Method to display values
    public static void displayValues() {
        System.out.println("Private Var: " + privateVar);
        System.out.println("Default Var: " + defaultVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Public Var: " + publicVar);
    }
}
