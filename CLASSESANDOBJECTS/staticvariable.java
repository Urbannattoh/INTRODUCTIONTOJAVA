class Mobile
{
String brand;
int price;
static String color;
String model;
String os;
String ram;
String storage;
String battery;
String camera;
String processor;
String display;

        public void show()
        {
            System.out.println("Brand: "+ brand + " price: " + price +" Color: "+ color +" Model: "+ model +" Operating System: "+ os);
        }

}




public class staticvariable 
{
    public static void main(String[] args)
    {
    Mobile mobile  = new Mobile();
    mobile.brand = "Samsung";
    mobile.price = 50000;
    mobile.color = "Black";
    mobile.model = "S10";
    mobile.os = "Android";
    mobile.ram = "8GB";
    mobile.storage = "128GB";
    mobile.battery = "4000mAh";
    mobile.camera = "12MP";
    mobile.processor = "Octa-core";
    mobile.display = "6.1inch";

    Mobile mobile2 = new Mobile();
    mobile2.brand = "Apple";
    mobile2.price = 60000;
    mobile2.color = "White";
    mobile2.model = "Iphone";
    mobile2.os = "ios";
    mobile2.ram = "6GB";
    mobile2.storage = "256GB";
    mobile2.battery = "3000mAh";
    
    
    // print this will return all white 
    // System.out.println(mobile.color);
    mobile.show();
    mobile2.show();

    }
    
}
