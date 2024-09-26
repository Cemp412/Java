import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The values of a:" + a + ", b:" + b + ", c:" + c + " respectively.");
        if((a > b) && (a > c)) {
            System.out.println("a is largest number");
        }
        else if((b > a) && (b > c)) {
            System.out.println("b is largest number");
        }
        else{
            System.out.println("c is largest number");
        }

    }
}