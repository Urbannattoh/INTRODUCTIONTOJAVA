public class jaggedarray {
    public static void main(String[] args) 
    {
        // create a multidimensional jugged array

        int num [][]= new int[5][];
        num [0] =new int[3];
        num [1] =new int[4];
        num [2] =new int[2];
        num [3] =new int[3];
        num [4] =new int[2];

    
        /*     Generate random numbers and assign them to the array. Random produces double numbers so we multiply
                by 100 or 10 to get whole numbers*/
        for(int i=0; i<num.length;i++)
        {
            for(int j=0; j<num[i].length;j++)
            {
                num[i][j] =(int)(Math.random()*10);
            }
            
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
