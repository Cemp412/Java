import java.util.*;

public class BinaryNumberPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int totalRows = sc.nextInt();
        printBinaryNumPattern(totalRows);
    }

    public static void printBinaryNumPattern(int n) {
        //outer loop
        for(int i = 1; i <= n; i++) {
            //inner loop
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}