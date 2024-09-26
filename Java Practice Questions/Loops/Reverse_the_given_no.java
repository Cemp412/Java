import java.util.*;

public class Reverse_the_given_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n:");
        int n = sc.nextInt();

        int reverse = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            int removeLastDigit = n / 10;
            n = removeLastDigit;
        }
        System.out.println("Reverse of a given number is:" + reverse);
    }
}