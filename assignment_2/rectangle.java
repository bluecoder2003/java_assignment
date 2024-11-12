import java.util.*;
class rectangle
{
    int l, b;
    float area, perimeter;
    void inputData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    void calculateArea()
    {
        area=l*b;
    }
    void calculatePerimeter()
    {
        perimeter=2*(l+b);
    }
    void outputData()
    {
        System.out.println(area);
        System.out.println(perimeter);
    }
    public static void main(String args[])
    {
       rectangle ob=new rectangle();
       ob.inputData();
       ob.calculateArea();
       ob.calculateArea();
       ob.calculatePerimeter();
       ob.outputData();
    }
}