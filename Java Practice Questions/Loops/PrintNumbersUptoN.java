/** Write a program to print numbers b/w 1 to 10 */
import java.util.*;

public class PrintNumbersUptoN {
    public static void main(String args[]) {
        int counter = 1;
        while(counter <= 10) {
            System.out.println(counter);
            counter = counter + 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        
        counter = 1;
        int range = sc.nextInt();
        while(counter <= range) {
            System.out.print(counter + " ");
        } //infinte loop because counter variable not incremented.
        System.out.println();
    }
}