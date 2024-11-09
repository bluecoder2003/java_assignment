import java.util.Scanner;

public class prog1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String n = sc.nextLine().toUpperCase();//use nextline to read the whole line and use next to read only one word
        String replacedString = n.replaceAll("[AEIOU]", "*");
        System.out.println("New string: " + replacedString);
        sc.close();
    }
}
