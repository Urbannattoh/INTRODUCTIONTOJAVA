
// this	                                                                                super
// Refers to the current instance.	                                                    Refers to the parent class.
// Used to access instance variables, methods, or constructors of the same class.	    Used to access parent class variables, methods, or constructors.
// Can call overloaded constructors via this().	                                        Calls parent constructor via super().
// Works in any non-static context.	                                                    Works only in inheritance (subclasses).

class A
{
    public A()
    {
        super();
        System.out.println("in A");

    }
    public A(int n)
    {
        super();
        System.out.println("in A with int");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");

    }
    public B(int n)
    {
        this();
        System.out.println("in B with int");
    }
}

public class thisandsuper {

    public static void main(String[] args)
    {
        B obj = new B(10);
    }
}