import java.util.*;

public class AnagramsStrings {
    public static boolean areAnagramStrings(String str1, String str2) {
             
        //convert strings to lowerCase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //compare strings length
        if(str1.length() != str2.length()) {
            return false;
        }

        //convert strings into char array
        char[] str1CharArr = str1.toCharArray();
        char[] str2CharArr = str2.toCharArray();

        //sort the array
        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);

        boolean result = Arrays.equals(str1CharArr, str2CharArr);

        if(result) {
            System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }

        return result;        
    }

    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(areAnagramStrings(str1, str2));
    }
}