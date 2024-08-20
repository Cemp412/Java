import java.util.*;

public class MaxSubArraySum_PrefixSum {
    public static void maxSubArraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];

        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        //nums array loop
        for(int i=0; i< nums.length; i++) {
            int start = i;
            for(int j=i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
            }
            System.out.println("Current Sum :" + currSum);
            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Maximum sub array sum is :" + maxSum);
    }

    public static void main(String args[]) {
        int num[] = {1, -2, 6, -1, 3};
        maxSubArraySum(num);
    }
}