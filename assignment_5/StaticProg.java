package assignment_5;

class Counter {
    static int count = 0;

    // Constructor
    public Counter() {
        count++;
    }

    // Static method to display count
    public static void display() {
        System.out.println("Number of objects created: " + count);
    }
}

public class StaticProg {
    public static void main(String args[]) {
        new Counter();
        new Counter();
        new Counter();

        // Calling static method using class name
        Counter.display();
    }
}

//If you code the program without using static, the count variable would no longer be shared among all instances of the class. Instead, each instance of the Counter class would have its own separate count variable.