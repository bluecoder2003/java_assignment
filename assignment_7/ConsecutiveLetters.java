import java.util.Scanner;

public class ConsecutiveLetters {

    // Method to check if a word has at least one pair of consecutive letters
    public static boolean hasConsecutiveLetters(String word) {
        // Loop through the word to check for consecutive letters
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true; // Found consecutive letters
            }
        }
        return false; // No consecutive letters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input sentence from the user
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Convert the sentence into uppercase
        sentence = sentence.toUpperCase();

        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Initialize a variable to count words with consecutive letters
        int count = 0;

        System.out.println("Words with at least a pair of consecutive letters:");

        // Check each word for consecutive letters
        for (String word : words) {
            if (hasConsecutiveLetters(word)) {
                System.out.println(word); // Display the word
                count++; // Increment the counter
            }
        }

        // Display the total count
        System.out.println("Number of words containing consecutive letters: " + count);

        sc.close();
    }
}
