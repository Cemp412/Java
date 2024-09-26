import java.util.*;

public class SumOf_N_naturalNo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first 'n'=" + n + " natural numbers is sum=" + sum);

    }  
}