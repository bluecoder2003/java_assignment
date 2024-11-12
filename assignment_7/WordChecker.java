import java.util.Scanner;

public class WordChecker {
    
    // Method to check if the word is a palindrome
    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // It's a palindrome
    }
    
    // Method to check if the word is a special word
    public static boolean isSpecialWord(String word) {
        return word.charAt(0) == word.charAt(word.length() - 1); // Same first and last character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.println("Enter a word: ");
        String word = sc.nextLine().toUpperCase(); // Convert to uppercase to avoid case sensitivity issues

        // Check if the word is a palindrome or special word
        if (isPalindrome(word)) {
            System.out.println("The word is a Palindrome.");
        } else if (isSpecialWord(word)) {
            System.out.println("The word is a Special Word.");
        } else {
            System.out.println("The word is neither a Palindrome nor a Special Word.");
        }

        sc.close();
    }
}
