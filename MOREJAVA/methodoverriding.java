// Method Overloading

// Definition: Creating multiple methods in the same class with the same name but different parameters (type, number, or order).

// Key Points:

//         Compile-time polymorphism (resolved during compilation).
//         Methods with the same name but different parameters are treated as different methods.
//         The method to be called is determined by the number and type of arguments passed to it.
//         The method to be called is determined at compile time.
//         The method to be called is determined by the number and type of arguments passed to it.
//         Return type can be the same or different.
//         The method to be called is determined by the number and type of arguments passed to it.
//         The method to be called is determined at compile time.
//         Used for logical grouping of similar operations.


// Method Overriding

// Definition: Creating a new method in the subclass with the same name, return type, and parameter as the method in the superclass.
// Key Points:
//         Runtime polymorphism (resolved during runtime).
//         The method in the subclass has the same name, return type, and parameter as the method
//         in the superclass but it can have different implementation.
//         Used for logical extension of the superclass method.
//         The method in the subclass can access all the members of the superclass method.
//         The method in the subclass can also call the method in the superclass using the super keyword.
//         The method in the subclass can also call the method in the superclass using the superclass name.
//         The method in the subclass can also call the method in the superclass using the superclass reference.
//         The method in the subclass can also call the method in the superclass using the superclass object.
//         The method in the subclass can also call the method in the superclass using the superclass instance variable.
//         The method in the subclass can also call the method in the superclass using the superclass static method etc.
//         The method in the subclass can also call the method in the superclass using the superclass constructor etc




class A
{
    public void show()
    {
        System.out.println("showing in class A");
    }
    public void config()
    {
        System.out.println("Configuring class A");
    }
    
}

class B extends A
{
    //same name and same parameters overrides the show method above in A
    public void show()
    {
        System.out.println("showing in class B");
    }

}
public class methodoverriding 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.show();
        obj.config();

    }
}
