import java.util.*;

public class StaticKeyword {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    Animal() {
        String color;
        System.out.println("animal constructor is called...");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}