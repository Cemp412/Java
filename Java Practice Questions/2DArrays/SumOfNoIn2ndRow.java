//Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.

import java.util.*;

public class SumOfNoIn2ndRow {
    public static int SumOf2ndRowElements(int[][] matrix) {
        int row = 1;
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++) {
            sum += matrix[row][j];
        }
        return sum;
    }

    public static void main(String args[]) {
        int[][] nums = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        System.out.println(SumOf2ndRowElements(nums));
    }
    


}