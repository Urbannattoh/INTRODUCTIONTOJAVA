class Mobile
{
    //instance variable
    String brand;
    String model;
    int price;

    //static variable
    static String name;

    static
    {
        name = "Mobile";
        System.out.println("in static block");
    }

    public Mobile()
    {
        brand = "Samsung";
        model = "S10";
        price = 50000;
        System.out.println("in constructor clock");
        
    }

    public void show()
        {
            System.out.println("Brand: " + brand + " Model: "+model+ " Price: "+price);
        }
}





public class staticblock {
    public static void main(String[] args) throws ClassNotFoundException 
    {
        // Mobile mobile1 = new Mobile();
        // mobile1.brand = "Samsung";
        // mobile1.model = "S10";
        // mobile1.price = 50000;

        // Mobile mobile2 = new Mobile();
        // mobile2.brand = "Apple";
        // mobile2.model = "Iphone";
        // mobile2.price = 60000;

        //loading a class : call a certain block
        Class.forName("Mobile");



    }
}
