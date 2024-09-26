import java.util.*;

/** 
Constructor chaining in Java refers to the process where one constructor calls another constructor within the same class or a constructor from the parent class. This can be done either implicitly or explicitly using the this() or super() keywords.

Types of Constructor Chaining:
Within the Same Class (Using this()):

A constructor can call another constructor in the same class using the this() keyword.
This is useful when you have multiple constructors that share some common initialization logic.
From Parent Class (Using super()):

A constructor can call a constructor of its parent class using the super() keyword.
This is important when you're dealing with inheritance and want to ensure that the parent class is properly initialized before the child class. */

public class constructorChaining {
    public static void main(String args[]) {
        Example example = new Example();
    }
}

class Example {
    int x;
    int y;

    // Default constructor
    Example() {
        this(10); // Calls the constructor with one parameter
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    Example(int x) {
        this(x, 20); // Calls the constructor with two parameters
        System.out.println("Constructor with one parameter called");
    }

    // Constructor with two parameters
    Example(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor with two parameters called");
    }
}
