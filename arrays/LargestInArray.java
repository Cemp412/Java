
public class LargestInArray{
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }

            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is :" + smallest);
        return largest;

    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        System.out.println("Largest number in array: " + getLargest(numbers));
    }
}