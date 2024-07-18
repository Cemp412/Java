public class InvertedPattern { //print inverted star pattern
    public static void main(String args[]) {
        int n = 9; //total no. of lines
        for(int line = 1; line <= n; line++) {
            for(int star = 1; star <= (n - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}