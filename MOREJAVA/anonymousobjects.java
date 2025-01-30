class Acronyms
{
    public Acronyms()
    {
        System.out.println("Object created in this constructor");
    }
    public void show()
    {
        System.out.println("Acronyms are cool");
    }

}
public class anonymousobjects 
{
    
    public static void main(String[] args) 
    {
        //normal way of creating object
        Acronyms acronyms = new Acronyms();
        acronyms.show();

        //anonymous object-> the object doesnt have a name
        
        new Acronyms();



    }
}
