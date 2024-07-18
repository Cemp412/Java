import java.util.*;
public class Operators {
    public static void main(String args[]) {
        // Binary Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);

        //unary operators
        b = a++; //post increment
        System.out.println("post increment b:" +b);
        System.out.println("post increment a:" +a);

        b = ++a; //pre increment
        System.out.println("pre increment b:" +b);
        System.out.println("pre increment a:" +a);

         b = a--; //post decrement
        System.out.println("post decrement b:" +b);
        System.out.println("post decrement a:" +a);

        b = ++a; //pre decrement
        System.out.println("pre decrement b:" +b);
        System.out.println("pre decrement a:" +a);

        // Relational operators

        //Logical operators
        System.out.println((a>b) || (a == b));

        // Assignment operators
        b += a; //It executes fastly
        System.out.println(b);
    }

}