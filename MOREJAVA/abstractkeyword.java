//An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. 
//It can have abstract methods (methods without a body) that must be implemented by its subclasses, 
//as well as concrete methods (methods with a body).

// Key Points:
        // Declared using the abstract keyword.
        // Can have both abstract (without implementation) and concrete methods (with implementation).
        // Cannot be instantiated directly.
        // Used for defining a base class with common functionality while enforcing method implementation in subclasses.
        // Can have constructors, fields, and static methods.

// Abstract class Car serves as a blueprint for other car classes
abstract class Car 
{
    // Abstract method (must be implemented by subclasses)
    public abstract void drive();

    // Concrete method (has an implementation)
    public void playmusic() 
    {
        System.out.println("Playing music");
    }
}

// Audi class extends the abstract Car class
// It must provide an implementation for the abstract drive() method
class Audi extends Car {
    // Implementing the abstract method from Car
    public void drive() 
    {
        System.out.println("Driving Audi");
    }
}

// Main class to demonstrate the use of abstract classes
public class abstractkeyword 
{
    public static void main(String[] args) 
    {
        // Creating an object of Audi but referring to it using the Car type (polymorphism)
        Car obj = new Audi();

        // Calling the implemented drive() method from the Audi class
        obj.drive();  // Output: Driving Audi

        // Calling the concrete playmusic() method from the Car class
        obj.playmusic();  // Output: Playing music
    }
}
