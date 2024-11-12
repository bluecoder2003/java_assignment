import java.util.Scanner;

public class unique {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String n = sc.nextLine().toUpperCase();//use nextline to read the whole line and use next to read only one word
        char[] c = n.toCharArray();
        int count =0;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.println("Unique String");
        }
        else
        {
            System.out.println("Not a Unique String");
        }
    
        sc.close();
    }
}
