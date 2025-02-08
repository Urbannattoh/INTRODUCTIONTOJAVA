//once you make a class final it means no one can extend it (stop inheritance)
//final keyword can be used with a variable, class and a method
class Calc
{

    public final void show()
    {
        System.out.println("This is a calculator in Calc show");
    }
    public void add(int a, int b)
    {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }
}

class AdvCalc extends Calc
{
    //by using final on show method above, you cant override it hence the error.
    public void show()
    {
        System.out.println("This is an advanced calculator in AdvCalc show");
    }
}

public class finalmethod {
    public static void main(String[] args) 
    {
        Calc c = new Calc();
        c.show();
        c.add(5, 7);
      

    }
}
