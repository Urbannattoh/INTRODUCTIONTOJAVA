class calculator{
    
int a;

    public int add(int n1,int n2)
    {
        int r = n1 + n2;
        return r;
    }
}



public class classesandobjects 
{
    public static void main(String[] args) 
    {
        int num1 = 20;
        int num2 = 30;
    
        // System.out.println(results);
        // Creating an object of the class
        
        calculator calc=new calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
    
}
