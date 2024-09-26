import java.util.*;

public class CheckEvenOdd {
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if( (n & bitMask) == 0) {
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }

    public static void main(String args[]) {
        OddOrEven(3);
        OddOrEven(4);
        OddOrEven(11);
    }
}