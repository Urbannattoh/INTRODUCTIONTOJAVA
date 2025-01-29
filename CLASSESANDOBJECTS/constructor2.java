public class constructor2 {
    String brand;
    int year;

    // Constructor
    // Key Features of Constructors
    //     Name: Must match the exact name of the class.
    //     No Return Type: Unlike regular methods, constructors do not have a return type (not even void).
    //     Initialization: Used to set initial values for object attributes or perform setup tasks.
    public constructor2() {
        brand = "Unknown";
        year = 2023;
    }

    public static void main(String[] args) {
        constructor2 myCar = new constructor2(); // Constructor is called here
        System.out.println(myCar.brand); // Output: Unknown
        System.out.println(myCar.year);  // Output: 2023
    }
}