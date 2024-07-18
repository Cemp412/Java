import java.util.*;

public class conditional {
    public static void main(String args[]) {
        int age = 16;
        if(age >= 18) {
            System.out.println("adult: drive, vote");
        }
        else if(age > 13 && age < 18) {
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }

        /**
         * Find largest of two numbers
         */
        int a = 34;
        int b = 31;
        if(a >= b) {
            System.out.println("A is largest of two : " + a);
        }
        else{
            System.out.println("B is largest of two :" + b);
        }

        /**
         *  Print if a number is odd or even
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Value of num is:" + num);
        if(num % 2 == 0) {
            System.out.println("num is even number");
        }
        else{
            System.out.println("num is odd number");
        }
    }
}