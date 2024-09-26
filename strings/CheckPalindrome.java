//Question 1 - check if a string is palindrome  (asked by Intuit)

import java.util.*;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}