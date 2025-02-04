package test;

public class vehiclehelper {
    public static void checkVehicle(vehicle v) {
        // Can access DEFAULT members (same package)
        v.maintenanceCheck();
        System.out.println("VIN: " + v.vin);

        // Can access PUBLIC/PROTECTED members
        v.startEngine();
        v.accelerate(10);

        // Private members are NOT accessible
        
        // System.out.println(v.engineId); ❌ Compile error
    }
}