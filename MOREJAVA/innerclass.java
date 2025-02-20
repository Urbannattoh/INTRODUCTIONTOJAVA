class a
{
    int a;

    public void display() 
    {
        System.out.println("Display method of class a");
    }
    class b
    {
        int b;
        public void display2() 
        {
            System.out.println("Display method of class b");
        }
    }
}
public class innerclass 
{
    public static void main(String[] args) 
    {
        a obj1 = new a();
        obj1.display();

        a.b obj2 = obj1.new b();
        obj2.display2();
    }   
}
