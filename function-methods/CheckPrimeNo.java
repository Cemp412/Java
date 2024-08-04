public class CheckPrimeNo {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        //corner cases 
        if(n == 2) {
            return isPrime;
        }

       /*  for(int i=2; i <= n-1; i++) {
            if(n % i == 0){
                isPrime = false;
                return isPrime;
            }
        } */

       for(int i=2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<= n; i++) {
            if(isPrime(i)) {
                System.out.println("i: " + i);
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
       
        // System.out.println(isPrime(5));
        primesInRange(10);
    }
}