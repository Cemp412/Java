import java.util.*;

public class CreateFirst2DArray {

    public static boolean search(int matrix[][], int key) {
        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Key found at cell (" + i + "," + j + ")");
                    return true;
                }                
            }
        }
        System.out.println("Key not found");
        return false;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][4];

        int n = matrix.length;
        int m = matrix[0].length;

        //input values into array
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        

        //print array
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 45);
    }
}