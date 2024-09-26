import java.util.*;

public class convertLettersToUpperCase {
    public static String toUppercase(String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1; i< str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length() -1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "This is a JAVA programming language";
        System.out.println(toUppercase(str));
    }
}