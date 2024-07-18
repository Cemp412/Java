/** Write a program to print "hello world" 100 times using various loops */
public class Loops {
    public static void main(String args[]) {
        int counter=0;
        // while loop
        // while(counter < 100) {
        //     System.out.println("Hello World");
        //     // System.out.println(counter);
        //     counter = counter + 1;
        // }

        //for loop
        // for(int i=0; i<100; i++) {
        //     System.out.println("Hello World"); 
        // }

        //do-while loop
        int i = 0;
        do{
            System.out.println("Hello world");
            System.out.println(i);
            i++;
        }
        while(i < 100);
    }
}
