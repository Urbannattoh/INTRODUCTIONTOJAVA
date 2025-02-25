class a
{
    public void show()
    {
        System.out.println("In class A");
    }
}


public class anonymousinnerclass 
{
    public static void main(String[] args) 
    {
        a obj = new a()
        {
            public void show()
            {
                System.out.println("In Anonymous class");
            }
        };
        
        obj.show();
        

        
    }
    
}
