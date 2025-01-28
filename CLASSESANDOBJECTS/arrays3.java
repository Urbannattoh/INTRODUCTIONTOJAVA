public class arrays3 {
    public static void main(String[] args) 
    {
        // create a multidimensional array

        int num [][]= new int[5][10];
    
        /*     Generate random numbers and assign them to the array. Random produces double numbers so we multiply
                by 100 or 10 to get whole numbers*/
        for(int i=0; i<5;i++)
        {
            for(int j=0; j<10;j++)
            {
                num[i][j] =(int)(Math.random()*10);
            }
            
        }

    //   print or display a multidimensional array version 1
        for(int i=0; i<5;i++)
        {
            for(int j=0; j<10;j++)
            {
                System.out.print(num[i][j]+ "  ");
            }
            System.out.println(" ");
        }

    //   print or display a multidimensional array version 2
        for(int n[] : num)
        {
            for(int m : n)
            {
                System.out.print(m + "  ");
            }
           
            System.out.println(" ");
        }
        
    }
}
