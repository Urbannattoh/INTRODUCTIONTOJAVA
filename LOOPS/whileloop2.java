public class whileloop2 
{
    public static void main(String[] args) 
    {
    // outer loop
    int i = 1;
    while (i <= 10) 
    {
        System.out.println("Hi" + i);

        // inner loop
        int j = 1;
        while (j <= 5)
         {
            System.out.println("Hello" + j);
            j++;
        
        }

        i++;
    }

    System.out.println("Bye exiting code" + i);
    
    }
}
