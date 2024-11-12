import java.util.*;
class sort
{
    int[] arr = new int[10];
    void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void arrange()
    {
        for(int i=0;i<10-1;i++)
        {
            for(int j=0;j<10-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting: ");
		for(int i = 0; i<10; i++){
			System.out.print(arr[i]+" ");
		}
    }
    void search(int key)
    {
        int low = 0;
        int high = 9;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Number " + key + " found at position " + (mid + 1));
                found = true;
                return;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Number " + key + " not found.");
        }
    }
    public static void main(String args[])
    {
        sort ob=new sort();
        ob.readArray();
       ob.arrange();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        ob.search(key);
    }
}