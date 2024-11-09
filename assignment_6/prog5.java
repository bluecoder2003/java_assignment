import java.util.Scanner;
public class prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String wordWithMaxVowels = "";
        int maxVowels = 0;

        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowels) {
                maxVowels = vowelCount;
                wordWithMaxVowels = word;
            }
        }

        System.out.println("Word with maximum vowels: " + wordWithMaxVowels);
    }
    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
