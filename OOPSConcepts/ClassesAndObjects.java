import java.util.*;

public class ClassesAndObjects {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Orange");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calcPercentage(78, 89,90);
        System.out.println(s1.percentage);
    }
}

class Pen { //declare another class
    String color;
    int tip; //thickness of pen

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + maths + chem) /3;
    }
}