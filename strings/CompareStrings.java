import java.util.*;

public class CompareStrings {
    public static void main(String args[]) {
        String s1 = "TONY";
        String s2 = "TONY";
        String s3 = new String("TONY");

        //It compares object + value both
        if(s1 == s2) {
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }

        //It compares object + value both
        if(s2 == s3) {
            System.out.println("Both strings are equal"); 
        }
        else{
            System.out.println("Both strings are not equal"); //output
        }

        //It compares value only
        if(s1.equals(s3)) {
            System.out.println("Both strings have same value");
        }
        else{
            System.out.println("Both strings have different value");
        }
    }
}