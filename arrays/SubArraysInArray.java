import java.util.*;

public class SubArraysInArray {
    public static void printSubArrays(int numbers[]) {
        int totSubArr = 0;
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;;

        for(int i=0; i < numbers.length; i++) {
            int start = i; //initialize start
            for(int j=i; j < numbers.length; j++) {
                int end = j; ////initialize end
                int sum = 0;
                for(int k=start; k <= end; k++) {
                    System.out.print(numbers[k] + "");
                    sum = sum + numbers[k];
                    
                }

                // to find minimum and maximum value in an array
                if(sum > 0) {
                    
                    if(min > sum || min == 0) {
                        min = sum;
                    }

                    if(max < sum) {
                        max = sum;
                    }
                }
                totSubArr++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Max value in Subarrays is: " + max);
        System.out.println("Min value in Subarrays is: " + min);
        System.out.println("Total number of subarrays in an array:" + totSubArr);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}

