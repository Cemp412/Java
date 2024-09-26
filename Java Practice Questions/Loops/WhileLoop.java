/** Write a program to print "hello world" 100 times */
public class WhileLoop {
    public static void main(String args[]) {
        int counter=0;
        while(counter < 100) {
            System.out.println("Hello World");
            // System.out.println(counter);
            counter = counter + 1;
        }
    }
}