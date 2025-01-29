class Human
{
    private int age;
    private String name;

    // Key Features of Constructors
    //     Name: Must match the exact name of the class.
    //     No Return Type: Unlike regular methods, constructors do not have a return type (not even void).
    //    Initialization: Used to set initial values for object attributes or perform setup tasks.
  
    // Default Constructor:
    //      If you don’t define a constructor, Java provides a default one (with no parameters).
    //      Initializes fields to default values (e.g., 0, null, etc.).

    //if you want to do any operation; ALWAYS DO IT IN A METHOD

    public Human()
    {
        age = 20;
        name = "John";        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
public class constructor {
    
    public static void main(String[] args) 
    {
        Human human = new Human();
        System.out.println(human.getName());
        System.out.println(human.getAge());

        // human.setAge(30);
        // human.setName("John");
        
    }
}
