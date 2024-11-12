package assignment_5;

// Base class
class Animal {
    String type = "General Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    String type = "Dog";

    void display() {
        System.out.println("Type in Dog class: " + type);
        System.out.println("Type in Animal class: " + super.type); // Accesses Animal's type
    }

    void sound() {
        super.sound(); // Calls superclass method
        System.out.println("Dog barks");
    }
}

public class SuperKeywordDemo { // Rename class to avoid confusion with 'super' keyword
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
        myDog.sound();
    }
}
