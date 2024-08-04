import java.util.*;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to convert into decimal:");
        int num = sc.nextInt();
        binToDecimal(num);
    }

    public static void binToDecimal(int binaryNum) {
        int orgNum = binaryNum;
        int pow = 0;
        int decNum = 0;

        while(binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binaryNum = binaryNum/10;
        }

        System.out.println("decimal of " + orgNum + " =" + decNum);
    }
}