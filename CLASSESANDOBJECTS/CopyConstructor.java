//Create a new object by copying fields from an existing object:
public class CopyConstructor {
    private String model;
    private int year;

    // Original constructor
    public CopyConstructor(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Copy constructor
    public CopyConstructor(CopyConstructor other) {
        this.model = other.model;
        this.year = other.year;
    }

    public static void main(String[] args) {
        CopyConstructor original = new CopyConstructor("Tesla", 2024);
        CopyConstructor copy = new CopyConstructor(original);
        System.out.println(copy);
    }
}