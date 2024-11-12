package assignment_5;

// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class methodoverriding {  // Renamed class to follow conventions
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Calls Animal's version of sound()

        Dog myDog = new Dog();
        myDog.sound(); // Calls Dog's overridden version of sound()
    }
}
