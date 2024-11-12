package assignment_5;

// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Single inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class single {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Inherited method from Animal class
        myDog.bark();  // Method from Dog class
    }
}
