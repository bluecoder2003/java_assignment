import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        // Split the sentence into words
        String[] words = input.split(" ");
        
        // Loop through the words array in reverse order and print each word
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
