import java.util.*;

public class InvertedRotatedHalfPyramidWithNumbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int totalRows = sc.nextInt();

        halfPyramidPatternWithNo(totalRows);
    }

    public static void halfPyramidPatternWithNo(int totalRows) {
        //outer loop 
        for(int i = 1; i<= totalRows; i++) {

            //inner loop
            for(int j = 1; j <= (totalRows -i +1); j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
       
    }
}