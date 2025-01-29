//Restrict object creation using a private constructor

public class PrivateConstructor {
    private static PrivateConstructor instance;

    // Private constructor to block direct instantiation
    private PrivateConstructor() {
        // Setup database connection
    }

    // Global access point
    public static PrivateConstructor getInstance() {
        if (instance == null) {
            instance = new PrivateConstructor();
        }
        return instance;
    }
}