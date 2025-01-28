public class arrays2 {
    public static void main(String[] args) 
    {
        int num []= new int[5];
        num[0] =8;
        num[1] = 3;
        num[2] = 7;
        num[3] = 10;
        num[4] = 2;
        System.out.println("The elements of the array are: " +num[0] + " , "+num[1]+" , "+num[2]+" , "+num[3]+" and "+num[4]);

        for(int i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }

        // fetch the first number in array
        //System.out.println(num[0]);
    }
}
