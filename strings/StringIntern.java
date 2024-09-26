public class StringIntern {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Before interning
        System.out.println(str1 == str2); // Output: false

        // After interning
        str1 = str1.intern();
        str2 = str2.intern();

        System.out.println(str1 == str2); // Output: true
    }
}
