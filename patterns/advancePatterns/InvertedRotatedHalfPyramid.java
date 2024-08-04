import java.util.*;

public class InvertedRotatedHalfPyramid{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in pattern:");
        int rows = sc.nextInt();
        halfPyramid(rows);
    }

    public static void halfPyramid(int totRows) {
        //outer loop
        for(int i = 1; i <= totRows; i++) {
            //inner loop
            //loop to print spaces
            for(int j = 1; j <= (totRows - i); j++) {
                System.out.print(" ");
            }

            //loop to print stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}