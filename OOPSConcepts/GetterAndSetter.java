import java.util.*;

public class GetterAndSetter {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color; //return the value
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) { //modify or set value
        this.tip = newTip;
    }

    int getTip() {
        return this.tip;
    }
}