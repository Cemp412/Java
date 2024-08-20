import java.util.*;

public class InputOutputArray {
    public static void main(String args[]) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of an array:"  + marks.length);
        //input into an array
        marks[0] = sc.nextInt(); //physics
        marks[1] = sc.nextInt(); //chemistry
        marks[2] = sc.nextInt(); //math

        //outputs of an array
        System.out.println("Physics :" + marks[0]);
        System.out.println("Chemistry :" + marks[1]);
        System.out.println("Math :" + marks[2]);

        //update a value in an array
        // marks[2] = sc.nextInt() + 2; //add value in array value
        // System.out.println("Math :" + marks[2]);

        //calculate percentage
        int percent = (marks[0] + marks[1] + marks[2]) /3;
        System.out.println("Percentage : " + percent + "%");

    }
}