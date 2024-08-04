import java.util.*;

public class SolidRhombus {
    public static void printSolidRhombus(int totalRows) {
        //outer loop
        for(int row = 1; row <= totalRows; row++) {
            //inner loops
            //loop to print spaces
            for(int col=1; col <= (totalRows - row); col++) {
                System.out.print(" ");
            }

            //loop to print stars
            for(int col=1; col<= totalRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows:");
        int totalRows = sc.nextInt();
        printSolidRhombus(totalRows);
    }
}