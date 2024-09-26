import java.util.*;

public class Check_No_Is_Positive_Or_Negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n > 0) {
            System.out.println("N is a positive number");
        }
        else{
            System.out.println("N is a negative number");
        }
    }
}