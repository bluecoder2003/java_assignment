import java.util.Scanner;
public class prog4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String n = sc.nextLine();
        String []words= n.split(" ");
        int l=words.length;
        for(int i=0;i<l/2;i++)
        {
            String temp = words[i];
            words[i] = words[l - i - 1];
            words[l - i - 1] = temp;
        }
        StringBuilder replacedString = new StringBuilder();
        for (String word : words) {
            replacedString.append(word).append(" ");
        }
        System.out.println("New string: " + replacedString);
    }
}
