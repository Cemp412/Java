import java.util.*;

public class checkWhether_No_Is_Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n == 2) {
            System.out.println("n is a prime number.");
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++) { //Math.sqrt(n); -> (n-1)
                if(n % i == 0) { //n is a multiple of i (i is not equal to 1 or n)
                    isPrime = false; 
                }
            }
        }
        
        if(isPrime == true) {
            System.out.println("n is a prime number.");
        }
        else {
            System.out.println("n is not a prime number.");
        }
    }
}