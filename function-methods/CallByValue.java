import java.util.*;

public class CallByValue {

    // call by value mean - If you pass any value to the function after performing swapping it will returns original value because whatever happen in the function it will stay inside the function only.
    public static void swap(int a, int b)  {
        //swap 
        int temp = a;
        a = b;
        b = temp;
    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f; //factorial of n
    }

    public static int binCoeff(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNMR = factorial(n - r);
        int binCoeff = factN / (factR * factNMR);
        return binCoeff;
    }

    public static void main(String args[]) {
        //swap- values exchange
        int a = 5;
        int b = 10;
        swap(a, b);
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
        System.out.println("Value of a is:" + a);
        System.out.println("Value of b is:" + b);
    }
}