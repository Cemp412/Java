import java.util.*;
// package Loops;

public class PrintReverseOfN { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        while(n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            int removeLastDigit = n/10;
            n = removeLastDigit;

        }

    }
}