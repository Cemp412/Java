import java.util.*;

//Question 1 :Print the number of 7’s that are inthe 2d array
public class CountNoOf7InArray {
    public static int CountKeyInElement(int matrix[][], int key) {
        int count = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j< matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }

        if(count == 0) {
            System.out.println("Key doesn't exist in array");
        }
        return count;
    }

    public static void main(String args[]) {
        int[][] array = { {4, 7, 8}, {8, 8, 7}};
        int key = 7;
        System.out.println(CountKeyInElement(array, key));
    }
}