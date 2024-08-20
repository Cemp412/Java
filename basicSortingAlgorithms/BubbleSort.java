public class BubbleSort {
    public static void BubbleSortArray(int[] nums) {
        //declare loop
        for(int turn=0; turn<nums.length; turn++) {
            for(int j =0; j < nums.length-1- turn; j++) {
                if(nums[j] > nums[j+1] ) {
                    // begin swapping
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        printArray(nums);
    }

    //method to print sorted array
    public static void printArray( int[] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //declare main function 
    public static void main(String args[]) {
        int nums[] = {3, 6, 4, 5, 2, 1};
        BubbleSortArray(nums);
    }
}