class Calculator
{
    public int add(int n1, int n2)
    {
        // int results = n1 + n2;
        // return results;

        return n1 + n2;

    }
}

public class methods3 
{
    public static void main(String[] args) 
    {
    Calculator objCalculator = new Calculator();
    int r1 = objCalculator.add(1020, 2000);
    System.out.println(r1);
    }
}
