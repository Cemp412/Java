import java.util.*;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert it into binary form: ");
        int n = sc.nextInt();
        DecimalToBinary(n);
    }

    public static void DecimalToBinary(int n) {
        int decimalNum = n;
        int pow = 0;
        int binaryNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binaryNum = binaryNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary number of " + decimalNum + "=" + binaryNum);
    }
}