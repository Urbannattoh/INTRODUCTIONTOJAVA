class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing .....");
    }

    public String getMeAPen(int cost)
    {
        if (cost>=10) 
            {
            return "Pen";
            }
        else
            return "Nothing";
        
    }
}


public class methods {
    public static void main(String a[]) 
    {
        // System.out.println("MY METHODS AND CLASSES");
        // Computer computer = new Computer();
        // computer.playMusic();

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(12);
        
        System.out.println(str);
}
}
