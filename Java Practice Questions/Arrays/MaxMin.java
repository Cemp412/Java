import java.util.*;

public class MaxMin {
    public static void  main(String args[]) {
        int arr[] = {22, 14, 8, 17, 35, 3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if( min > arr[i]) {
                min = arr[i];
            }

            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value in array:" + min);
        System.out.println("Maximum value in array:" + max);
    }
}