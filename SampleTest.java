import java.util.*;
public class SampleTest {
   
   public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    // int star;
    
    // System.out.println("Enter the number");
    // star = sc.nextInt();
    int n = 5;
    char ch =  'A';
    for(int row=1; row<=n; row++) {
        for(int col=1; col<= n; col++) {
            if((col - row == 0) || (row +col == n+1)) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           
        }
        
        System.out.println();            
    }
      
    
    }
}