package Practice;

public class InterfaceAndAbstract {


    public static void main(String []args){
        Dog dog = new Dog();
        dog.sound();   // Dog barks
        dog.sleep();   // Sleeping...

        Animal.info(); // This is an Animal interface.


        Car car = new Car(100);
        car.start();  // Car is starting with speed: 100
        car.stop();   // Vehicle stopped.
    }
}


abstract class Vehicle {
    // Abstract method
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Instance variable
    int speed;

    // Constructor
    Vehicle(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Car is starting with speed: " + speed);
    }
}



class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
interface Animal {
    
    int a = 0;
    // Abstract method
    void sound();

    // Default method (introduced in Java 8)
    default void sleep() {
        System.out.println("Sleeping...");
    }

    // Static method (introduced in Java 8)
    static void info() {
        System.out.println("This is an Animal interface.");
    }
}