import java.util.*;

/** Example of method/function overloading */
public class Polymorphism {
    public static void main(String args[]) {
        Claculator calc = new Claculator();
        System.out.println(calc.sum(1,4));
        System.out.println(calc.sum((float) 1.4, (float) 4.8));
        System.out.println(calc.sum(6,4, 8));

        //method overridding
        Deer d = new Deer();
        d.eat();
    }
}

class Claculator {
    int sum = 0;
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

//Example of method overridding
//Base class
class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

//Derived class of animal class
class Deer{
    void eat() {
        System.out.println("eat grass");
    }
}