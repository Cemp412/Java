import java.util.*;

public class AvgOfThreeNums {
    public static int AvgOfThreeNums(int a, int b, int c, int count) {
        int avg = 0;
        avg = (a + b + c)/count;
        return avg;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int count = 1;
        int b = sc.nextInt();
        count++;
        int c = sc.nextInt();
        count++;
        System.out.println("Average of three numbers:" + AvgOfThreeNums(a, b, c, count));
    }
}