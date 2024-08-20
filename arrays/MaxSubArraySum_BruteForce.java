import java.util.*;

public class MaxSubArraySum_BruteForce {
    public static void maxSubArraySum(int nums[]) {
        // It is called Brute force method - basic approach to print max sum of an array 
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //begin loop
        for(int i=0; i< nums.length; i++) {
            int start = i;
            //second loop for next element 
            for(int j=i; j < nums.length; j++) {
                int end = j;
                currSum = 0;

                //third loop to proceed with 'start' and 'end' values of array
                for(int k=start; k <= end; k++) {
                    currSum += nums[k];
                }

                System.out.println("Current Sum :" + currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Maximum sub array sum is :" + maxSum);
    }

    public static void main(String args[]) {
        int num[] = {1, -2, 6, -1, 3};
        maxSubArraySum(num);
    }
}