// Access Modifiers Overview
// ==========================
// Modifier	                Scope
// public	                Accessible everywhere (any class, package, or subclass).
// protected	            Accessible within the same package + subclasses (even in other packages).
// default (no modifier)	Accessible only within the same package (also called package-private).
// private	                Accessible only within the same class.


// public Access Modifier
// ======================
// Scope: No restrictions.
// Use Case: For methods/variables that need to be part of an API or widely accessible.

// protected Access Modifier
// ==========================
// Scope: Same package.
// Subclasses (even in different packages).
// Use Case: For methods/variables meant to be inherited by subclasses.

// default (Package-Private)
// =========================
// Scope: Same package only.
// Use Case: For internal implementation details within a package

// private Access Modifier
// ==========================
// Scope: Same class only.
// Use Case: For encapsulation (hiding internal data).

// Summary
// --------
// public:      Widest access.
// protected:   Package + subclasses.
// default:     Package-only.
// private:     Class-only.

// N.B: Using the right access modifier helps maintain encapsulation, reduces bugs, and improves code organization
import test.*;

@SuppressWarnings("unused")
public class accessmodifiers 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
        Acronyms var1 = new Acronyms();
     

    }
}
