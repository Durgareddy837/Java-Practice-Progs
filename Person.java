// Define a class named "Person"
public class Person {
    // Instance variables (fields)
    String name;
    int age;

    // Constructor method
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Setter method for the age
    public void setAge(int age) {
        this.age = age;
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("John", 25);

        // Call methods on the object
        person1.displayInfo();

        // Use getter and setter methods
        String personName = person1.getName();
        System.out.println("Person's name: " + personName);

        person1.setAge(30);
        person1.displayInfo();
    }
}
