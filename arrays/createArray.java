import java.util.*;

public class CreateArray{
    public static void main(String args[]) {
        int marks[] = new int[50];
        // marks[51] = 34; This line will gives you error because in declared array we can only store variables upto 50 memory location last index is 49.

        int numbers[] = {1, 32, 4};
        String fruits[] = {"apple", "mango", "pine"};
        System.out.println(marks[49]); //empty declared array has 0 stored on all of its memory location.
        
    }
}
