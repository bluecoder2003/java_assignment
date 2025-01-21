package assignment_8.mypack;

public class Shape {
    public double getArea(double length, double breadth) {
        return length * breadth;
    }
    public int getArea(int side) {
        return side * side;
    }
    public double getArea(double radius) {
        return 3.14*radius*radius;
    }
}
