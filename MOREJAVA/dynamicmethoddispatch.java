class A 
{
    public void show()
    {
        System.out.println("Inside class A show");
    }

}

class B extends A
{
    public void show()
    {
        System.out.println("Inside class B show");
    }

}

class C extends A
{
    public void show()
    {
        System.out.println("Inside class C show");
    }

}


public class dynamicmethoddispatch
{

    public static void main(String[] args)
    {

        // dynamic method dispatch (runtime polymorphism)
        A obj = new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
}