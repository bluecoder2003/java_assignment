package assignment_5;

// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Intermediate class
class Mammal extends Animal {
    void feed() {
        System.out.println("Mammal feeds its young");
    }
}

// Derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Inherited from Animal
        myDog.feed();  // Inherited from Mammal
        myDog.bark();  // Defined in Dog
    }
}
