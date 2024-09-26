import java.util.*;

public class BitwiseOperators{
    public static void main(String args[]) {
        //Bitwise (&)
        System.out.println(5 & 6); //output : 4
        // System.out.println(5 && 6); //It gives you error
        //Bitwise (|)
        System.out.println(5 | 6);
        //Bitwise (^)
        System.out.println(5 ^ 6);
        //Binary 1's complement
        System.out.println(~5);
        System.out.println(~0);
        //Binary left shift
        System.out.println(5 << 2);
    }
}