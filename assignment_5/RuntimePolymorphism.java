package assignment_5;

// Base class
class Figure {
    // Method to be overridden by subclasses
    void area() {
        System.out.println("Calculating area of a figure");
    }
}

// Derived class Rectangle
class Rectangle extends Figure {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area method for rectangle
    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Derived class Triangle
class Triangle extends Figure {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the area method for triangle
    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class RuntimePolymorphism{
    public static void main(String[] args) {
        // Creating objects of Rectangle and Triangle
        Figure rect = new Rectangle(5, 10);
        Figure tri = new Triangle(6, 8);

        // Demonstrating runtime polymorphism
        rect.area();  // Calls Rectangle's area method
        tri.area();   // Calls Triangle's area method
    }
}
