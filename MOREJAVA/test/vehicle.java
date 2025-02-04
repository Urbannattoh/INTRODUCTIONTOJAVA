package test;

public class vehicle {
    // Public variable (accessible everywhere)
    public static final String TYPE = "Vehicle";

    // Protected variable (accessible in subclasses + same package)
    protected int speed;

    // Default (package-private) variable (accessible only in same package)
    String vin; // No access modifier

    // Private variable (accessible only in this class)
    private String engineId;

    // Public constructor
    public vehicle(String vin) {
        this.vin = vin;
        this.engineId = "E-" + vin;
    }

    // Public method (accessible everywhere)
    public void startEngine() {
        System.out.println("Engine started");
    }

    // Protected method (accessible in subclasses + same package)
    protected void accelerate(int increment) {
        speed += increment;
        internalLog("Speed increased to " + speed);
    }

    // Default method (accessible only in same package)
    void maintenanceCheck() {
        System.out.println("Maintenance check completed");
    }

    // Private method (accessible only in this class)
    private void internalLog(String message) {
        System.out.println("[LOG] " + message);
    }
}