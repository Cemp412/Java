public class ReverseAnArray {
    public static void reverse(int numbers[]) {
        int temp = 0;
        int first = 0;
        int last = numbers.length-1;

        //loop
        while(first < last) {
            //swap values of array index first and last
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }

    }

    //declare main method
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);

        for(int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
