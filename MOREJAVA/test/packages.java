// In Java, packages are used to organize classes and interfaces into namespaces, similar to folders in a file system. 
//They help prevent naming conflicts, improve code maintainability, and control access to classes. 
//Let’s break down how packages work:

// Purpose of Packages
        // Avoid Naming Conflicts: Classes in different packages can have the same name.
        // Organize Code: Group related classes (e.g., com.company.model, com.company.util).
        // Access Control: Classes in the same package can access protected and default (package-private) members.
        // Reusability: Easily import classes from other packages.

// Declaring a Package
        // Use the package keyword at the top of a Java file.
        // The directory structure must match the package name.
        // For example, if you have a package named com.example.helloworld, the directory structure should
        // be src/main/java/com/example/helloworld/HelloWorld.java.
        
// Common Built-in Packages
        // java.lang: Automatically imported (e.g., String, System, Math).
        // java.util: Utilities (e.g., ArrayList, Scanner, Collections).
        // java.io: Input/output (e.g., File, InputStream).
        // java.net: Networking (e.g., URL, Socket).
        // java.awt/javax.swing: GUI components.
        
// Best Practices
        // Meaningful Names: Use clear package names (e.g., com.company.project.ui for UI classes).
        // Avoid Deep Nesting: Don’t overcomplicate (e.g., com.company.project.util is better than com.company.project.helpers.utils).
        // No Default Package: Avoid placing classes in the default (unnamed) package.
        // Consistent Naming: Follow your project’s naming conventions strictly.



package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//use import to access this package otherwise it will return error


public class packages 
{
    public static void main(String[] args) 
    {

    }
}
