import java.util.*;

public class TernaryOperator {
    public static void main(String args[]) {
        int number = 4;
        
        //ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);

        /** Write a program to check if a student will pass or fail */
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status = (marks >= 33) ? "pass" : "fail";
        System.out.println(status);
    }
}