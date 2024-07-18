import java.util.*;

public class Question_breakKeyword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n % 10 == 0) { // where n is a multiple of 10 in that if case
                break;
            }
            System.out.println(n);
        } while(true);
    }
}