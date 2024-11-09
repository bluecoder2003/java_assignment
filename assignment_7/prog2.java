import java.util.Scanner;

public class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String n = sc.nextLine().toUpperCase();//use nextline to read the whole line and use next to read only one word
        int l=n.length();
        int value=0;
        for (int i = 0; i < l; i++) {
            char ch = n.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 1;
            }
        }
        int temp=value;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        sc.close();
    }
}
