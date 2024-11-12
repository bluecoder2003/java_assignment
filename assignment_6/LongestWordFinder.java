import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        // Split the string into words
        String[] words = input.split(" ");
        
        String longestWord = "";
        int maxLength = 0;
        
        // Loop through each word to find the longest one
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        
        // Output the longest word and its length
        System.out.println("The longest word: " + longestWord.toUpperCase());
        System.out.println("The length of the word: " + maxLength);
        
        sc.close();
    }
}
