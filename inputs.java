import java.util.*;

public class Inputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next(); //scans a single word
        // System.out.print(input);

        // String name = sc.nextLine(); //Scans whole input line
        // System.out.println(name);

        // int number = sc.nextInt(); //Scans integer
        // System.out.println(number);

        // float price = sc.nextFloat(); //Scans floating value
        // System.out.println(price);

        /*
            Print sum of two numbers 'a' and 'b' using user inputs
        */
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int product =  a * b;
        // System.out.println(sum);

        /*
            Print Area of a circle taking radius as input from user
        */
       float radius = sc.nextFloat();
       float area = 3.14f * radius * radius;
       System.out.println(area);

    }
}