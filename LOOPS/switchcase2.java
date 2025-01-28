public class switchcase2 {
    public static void main(String[] args) 
    {
        String day = "Monday";

        switch(day)
        {
            case "Saturday", "Sunday" -> System.out.println("Weekend: wake up at 6AM");
    
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday: wake up at 7AM");

            default -> System.out.println("Invalid day");
        }


    }
    
}
