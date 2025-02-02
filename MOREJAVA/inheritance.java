public class inheritance 
{
    public static void main(String[] args) 
    {
        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.add(4,5);
        int r2 = calc.sub(4,5);
        int r3 = calc.multi(50, 10);
        int r4 = calc.div(50, 10);
        double r5 = calc.power(20, 7);
        System.out.println("Addition: "+r1);
        System.out.println("Subtraction: "+r2);
        System.out.println("Multiplication: "+r3);
        System.out.println("Division: "+r4);
        System.out.println("Power: "+r5);
    }

}
