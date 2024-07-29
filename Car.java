// Define a class named "Car"
class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Constructor method
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        // Create two instances (objects) of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2021);

        // Call methods on the objects
        System.out.println("Car 1 details:");
        car1.displayInfo();

        System.out.println("\nCar 2 details:");
        car2.displayInfo();
    }
}
