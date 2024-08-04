import java.util.*;

public class HollowRectangle {
    public static void hollowRectangle(int totalrows, int totalcols) {

        

        //outer loop - rows
        for(int i=1; i<= totalrows; i++) {
            //inner loop - columns
            for(int j=1; j<= totalcols; j++) {
                //cell - (i, j)
                if(i == 1 || i == totalrows || j == 1 || j == totalcols) {
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int totalrows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int totalcols = sc.nextInt();
        hollowRectangle(totalrows, totalcols);
    }
}