import java.util.*;

public class Hierarchial {
    public static void main(String args[]) {
        Mammal doggy = new Mammal();
        doggy.breed = "Bulldog";
        doggy.eat();

        Bird peacock = new Bird();
        peacock.fly();
        peacock.eat();
    }
}

//Base class
class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathes() {
        System.out.println("breathes");
    }
}

//Derived class
class Mammal extends Animal {
    String breed;
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void Swim() {
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly() {
        System.out.println("fly");
    }
}