import java.util.*;

public class ReverseAnArray {
    public static void main(String args[]) {
        int arr[] = {4, 5, 1, 3, 2};
        int num[] = new int[arr.length];
        for(int i = arr.length - 1; i>=0; i--) {
            num[arr.length - 1 - i] = arr[i];
        }

        // Reversing the array
        // for(int i = 0; i < arr.length; i++) {
        //     num[i] = arr[arr.length - 1 - i];
        // }
        printReverseArr(num);
    }

    public static void printReverseArr(int[] num) {
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }
    
}