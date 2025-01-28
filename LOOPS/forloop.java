public class forloop {
    public static void main(String[] args) 
    {
       
        for(int i=1;i<=7;i++)
        {
        System.out.println("THE DAY IS " + i);
       
            for(int j = 1; j<=9; j++)
            {
            System.out.println("   THE TIME IS " + (j+8) + "-" + (j+9));
            }
    }
    }
}
