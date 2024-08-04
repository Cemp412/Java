import java.util.*;

public class FactorialBinomialCoefficient {
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
        int a = 10;
        int b = 3;
        int factorial = factorial(a);
        System.out.println("Factorial of a is:" + factorial);
        System.out.println("Value of a is:" + a);
        System.out.println("Value of b is:" + b);
        int binCoeff = binCoeff(a, b);
        System.out.println("Binomial coefficient of a and b is" + binCoeff);
    }
}