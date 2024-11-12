package assignment_9;

// Interface 1
interface Animal {
    void sound();  // Method to be implemented by any class that implements this interface
}

// Interface 2
interface Vehicle {
    void move();  // Method to be implemented by any class that implements this interface
}

// Class that implements both interfaces (Multiple Inheritance)
class AmphibiousVehicle implements Animal, Vehicle {
    // Implementing the sound method from Animal interface
    @Override
    public void sound() {
        System.out.println("The amphibious vehicle makes a sound.");
    }

    // Implementing the move method from Vehicle interface
    @Override
    public void move() {
        System.out.println("The amphibious vehicle moves on land and water.");
    }
}

public class interfaceinheritance {
    public static void main(String[] args) {
        // Creating an object of AmphibiousVehicle
        AmphibiousVehicle av = new AmphibiousVehicle();

        // Calling methods from both interfaces
        av.sound();  // Animal's method
        av.move();   // Vehicle's method
    }
}
