import java.util.*;

public class AssignmentQues {
    //bubble sort algorithm
    public static void BubbleSort(int[] arr) {
       for(int turn=0; turn< arr.length; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                }
            }
       }
        printArray(arr);
    }

    //selection sort algorithm
    public static void selectionSort(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            int minPos = i;
            for(int j=i+1; j< arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }

    //Insertion sort algorithm
    public static void InsertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev > 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //swap
            arr[prev+1] = curr;
        }
        printArray(arr);
    }

    //Counting Sort algorithm
    public static void CountingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[]
    }
    //print array method
    public static void printArray(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
    }



    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        BubbleSort(arr);
        selectionSort(arr);
        InsertionSort(arr);
    }
}