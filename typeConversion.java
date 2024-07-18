import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextFloat(); // this conversion will not happen because size of (float > int) so it cannot be converted to int type
        // float a = sc.nextInt(); // type conversion OR Implicit conversion OR Widening Conversion
        // System.out.println(n);
        // System.out.println(a);

        /**
         *  type casting in java
         */
        float a = 23.90f;
        int b = (int) a; //It is known as narrowing conversion OR Explicit Conversion
        System.out.println(b);
        
        /**
         * type casting of character to int
         */
        char ch = 'r';
        char ch2 = 'S';
        int number1 = (int) ch; //It returns character value in ASCII code
        int number2 = (int) ch2;
       // Print the ASCII value
        System.out.println("The ASCII value of '" + ch + "' is: " + number1);
        // Print the ASCII value
        System.out.println("The ASCII value of '" + ch2 + "' is: " + number2);
        System.out.println("Type Promotion work with expressions only");
        System.out.println(ch2 - ch);

    }
}