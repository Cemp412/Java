/** Write a program to print given 2D array using spiral matrix */

import java.util.*;
public class SpiralMatrix {
    public static void printSpiralMatrix(int matrix[][]) {
        int startrow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startrow <= endRow && startCol <= endCol) {
            //top
            for(int i= startCol; i<=endCol; i++) {
                System.out.print(matrix[startrow][i] + " ");
            }

            //right
            for(int j=startrow+1; j<=endRow; j++) {
                System.out.print(matrix[j][endCol] + " ");
            }

            //bottom
            for(int i= endCol-1; i>= startCol; i--) {
                if(startrow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            //left
            for(int j= endRow-1; j >= startrow+1; j--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[j][startCol] + " ");
            }

            //updating variables
            startCol++;
            startrow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = { 
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                        };

        printSpiralMatrix(matrix);
    }
}