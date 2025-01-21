package assignment_8.mypack;

public class Figure{
    public static void main(String[] args) {
        Shape s=new Shape();
        double rectarea = s.getArea(2.0,3.0);
        System.out.println(rectarea);
        int squarearea = s.getArea(5);
        System.out.println(squarearea);
        double circlearea = s.getArea(2.0);
        System.out.println(circlearea);
    }
}
