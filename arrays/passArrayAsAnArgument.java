import java.util.*;

public class passArrayAsAnArgument {
    public static void updateArray(int marks[], int nonchangeable) {
        nonchangeable = 10;
        for(int i=0; i< marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    //declare main function
    public static void main(String args[]) {
        int marks[] = {97,98, 99};
        int nonchangeable = 5;
        updateArray(marks, nonchangeable);
        System.out.println(nonchangeable);
        
        //print our marks
        for(int i=0; i< marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}