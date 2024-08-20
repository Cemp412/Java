import java.util.*;

public class BinarySearchInArray {
    public static int binarySearch(int numbers[], int key) {
        //binary search
        int start = 0, end = numbers.length -1;
       
        //proceed in loop
        while(start <= end) {
             int midPoint = (start + end) /2;
            //comparisons
            if(numbers[midPoint] == key) { //found
                return midPoint;
            }

            if(numbers[midPoint] < key) { //right - 2nd half
                start = midPoint + 1;
            }
            else{ //left - 1st half
                end = midPoint - 1 ;
            }
        }
        return -1;
    }

    //decalre main function
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14}; //sorted array
        int key = 10;
        int resultOfSearch = binarySearch(numbers, key);
        System.out.println("Index for key is :" + resultOfSearch);

    }
}