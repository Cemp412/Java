import java.util.*;
/** declare a class first (class name will be same as file name) */
public class BasicFunctionStructure {

    public static void printHelloWorld() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
        return; //function must have return type (you can skip return statement for return-type void only.)
    }

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is:" + sum);
    }

    public static void main(String args[]) { // main is pre-defined keyword in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to print their sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printHelloWorld();
        calculateSum(a, b);
    }
}