package practice2;

public class p1 {
    public static void main(String[] args)
    {
        try{
            int[] num={1,2,3};
            try{
                int result = num[1] / 0;
                System.out.println(result);
            }
            catch(ArithmeticException e)
            {
                System.out.println("cant divide by zero");
            }
            try{
                int result = num[3] + num[2];
                System.out.println(result);
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("index not present");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally 
        {
            System.out.println("Finally block executed.");
        }
    }
}



/*package practice2;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();
            int[] num = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                num[i] = scanner.nextInt();
            }

            try {
                System.out.println("Enter the index for division operation:");
                int index = scanner.nextInt();
                int result = num[index] / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            try {
                System.out.println("Enter two indices to add:");
                int index1 = scanner.nextInt();
                int index2 = scanner.nextInt();
                int result = num[index1] + num[index2];
                System.out.println("Result: " + result);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index not present");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}*/