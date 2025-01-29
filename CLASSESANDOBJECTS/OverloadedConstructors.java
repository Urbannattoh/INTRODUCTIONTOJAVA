public class OverloadedConstructors {
    private String name;
    private int age;

    // Default constructor
    public OverloadedConstructors() {
        name = "Anonymous";
        age = 18;
    }

    // Parameterized constructor (name only)
    public OverloadedConstructors(String name) {
        this.name = name;
        age = 18; // Default age
    }

    // Full parameterized constructor
    public OverloadedConstructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        OverloadedConstructors p1 = new OverloadedConstructors(); // Uses default
        OverloadedConstructors p2 = new OverloadedConstructors("Alice"); // Name only
        OverloadedConstructors p3 = new OverloadedConstructors("Bob", 30); // Name + age
    }
}