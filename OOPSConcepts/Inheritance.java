import java.util.*;

public class Inheritance {
    public static void main(String args[]) {
       Fish shark = new Fish(); //created object of fish class
       shark.eat(); //call eat function of fish class (extends animal class.)
    }
}

 //Base class 
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived class / Subclass 
class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Swims in water");
    }
}