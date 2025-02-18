public class wrapperclass
{
    public static void main(String a[])
    {
        int num = 7;
        Integer  num1 = new Integer(8); //boxing

        int num2 = num; //autoboxing


        int num3 = num1.intValue(); //unboxing


        int num4 = num1;

        System.out.println(num1+" "+num2+" "+num3+" "+num4);
    }

}