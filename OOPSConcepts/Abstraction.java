import java.util.*;

public class Abstraction{
    public static void main(String args[]) {
        // Animal an = new Animal(); // can not instantiated because abstract classes has no objects.
        Horse h = new Horse(); 
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        // Chicken ch = new Chicken();
    }
}

abstract class Animal { //abstract class
    String color;
    void eat() {
        System.out.println("Eats anything");
    }

    abstract void walk(); //abstract method

    Animal() {
        color = "brown";
        System.out.println("Animal constructor is called");
    }

}

class Horse extends Animal {
    void walk() {
        System.out.println("Walk on 4 legs");
    }

    Horse() {
        color = "golden";
        System.out.println("Horse constuctor is called");
    }
}


class Chicken extends Animal {
    void walk() {
        System.out.println("Walk on 2 legs");
    }

    Chicken() {
        color = "dark brown";
        System.out.println("Chicken constuctor is called");
    }
}