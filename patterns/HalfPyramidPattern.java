import java.util.*;

public class HalfPyramidPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        //Print half-pyramid pattern
        for(int line = 1; line <= n; line++) {
            for(int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}