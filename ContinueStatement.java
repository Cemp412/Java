import java.util.*;
public class ContinueStatement {
    public static void main(String args[]) {
        // print numbers b/w 1 to 5
        for(int i=0; i<=5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }


        /** Display all numbers entered by user expect multiples of 10 */
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number:");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }
           
            System.out.println("number was:" + n);
        } while(true);



    }
}