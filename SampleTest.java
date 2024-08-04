import java.util.*;
public class SampleTest {
   
   public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("First number is a :" + a);
        boolean num = isEven(a);
        System.out.println(num);

    }
      
    public static boolean isEven(int n) {
        boolean isEven = false;
        if(n % 2 == 0) {
            return isEven = true;
        }
        else{
            return isEven = false;
        }
    }
    
    
}