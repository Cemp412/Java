import java.util.*;

public class Palindrome{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it's palindrome or not:");
        int n = sc.nextInt();
        boolean palindrome = isPalindrome(n);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int number) {
       int palindrome=number; // copied number into variable
       int reverse=0;
       while(palindrome!=0) {
            int remainder=palindrome%10;
            reverse = reverse*10 + remainder;
            palindrome=palindrome/10;
        }

        if(number==reverse) {
            return true;
        }
        else{
                return false;
        }
    }
    
}