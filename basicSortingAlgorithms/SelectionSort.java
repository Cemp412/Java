public class SelectionSort {
    public static void SelectionSortArra(int[] arr) {
        //loop
        for(int i =0; i < arr.length; i++) {
            int minPos = i;
            for(int j=i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]  = temp;
        }
      printArray(arr);
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
        int nums[] = {5, 4, 1, 3, 2};
        SelectionSortArra(nums);
    }
}