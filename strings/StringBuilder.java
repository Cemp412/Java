// import java.util.*;

public class StringBuilder {
    public static void main(String[] args) {
       java.lang.StringBuilder sb = new java.lang.StringBuilder(""); // Creates a new StringBuilder instance
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // Appends each character to the StringBuilder
        }
        System.out.println(sb); // Prints the final string
        System.out.println(sb.length());
    }
}

        //output : abcdefghijklmnopqrstuvwxyz
        //Time complexity : O(26)
        //If we use sb += ch so time complexity becomes O(26 * n^2);

