import java.util.*;

public class ButterflyPattern {
    
    public static void toPrintButterflyPattern(int totalRows) {
        //outer loop- 1st half
        for(int row = 1; row <= totalRows; row++) {
            //inner loops
            //loop to print LHS stars
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            //loop to print spaces -- [2 * (totalRows - row)]
            for(int col=1; col <= Math.round(2*(totalRows - row)); col++) {
                System.out.print(" ");
            }

            //loop to print RHS stars
            for(int col=1; col<= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop- 2nd half
        for(int row = totalRows; row >= 1; row--) {
            //loop to print stars
            for(int col=1; col<= row; col++) {
                System.out.print("*");
            }

            //loop to print spaces
            for(int col=1; col<= 2* (totalRows - row); col++) {
                System.out.print(" ");
            }

            //loop to print stars
            for(int col=1; col<= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows:");
        int totalRows = sc.nextInt();
        toPrintButterflyPattern(totalRows);
    }
}   
