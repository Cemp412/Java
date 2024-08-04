import java.util.*;

public class FloydsTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int noOfRows = sc.nextInt();
        printFloydsTriangle(noOfRows);
    }

    public static void printFloydsTriangle(int totalRows) {
        int counter = 1;
        for(int i=1; i <= totalRows; i++) { //outer loop
            for(int j=1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}