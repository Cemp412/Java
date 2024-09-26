import java.util.*;

public class MultiLevelInheritance {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.color = "Golden";
        dobby.breed = "Golden Retriever";

        System.out.println("dobby is a dog");
        System.out.println("breed: " + dobby.breed);
        System.out.println("color: " + dobby.color);
        System.out.println("leg: " + dobby.legs);

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathes() {
        System.out.println("breathes");
    } 
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
