class Human
{
    //if you make a class private it can only be accessible from the same class
    private int age = 11;
    private String name ="Navine";
    //if you make a class public it can be accessed from any class
   
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

}


public class encapsulation 
{
    public static void main(String[] args) 
    {
        Human human = new Human();
        // human.age = 25;
        // human.name = "John";
        System.out.println(human.getName());
        System.out.println(human.getAge());
        
    }
    
}
