import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("Xyz@#1234");

        //Strings are IMMUTABLE (non-changeable)
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //concatenation
        String firstName = "Whimsical";
        String lastName = "vibes";
        String fullName = firstName + " " + lastName;
        System.out.println("Fullname :" + firstName + " " + lastName);
        System.out.println(fullName.charAt(0));
        printLetters(fullName);

    }
}