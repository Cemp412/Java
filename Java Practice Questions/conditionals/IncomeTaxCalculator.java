import java.util.*;

/** Calculate income tax according to tax slab of fy-2024 */
public class IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        System.out.println("Income is:" + income);
        if(income <= 300000) {
            tax = 0;
        }
        else if(income >= 300001 && income <= 600000) {
            tax = (int) ((income - 300000) * 0.05);
        }
        else if(income >= 600001 && income <= 900000) {
            tax = (int) ((income - 300000) * 0.05) + (int) ((income - 600000) * 0.1);
        }
        else{
            tax =(int) ((income - 300000) * 0.05) + (int) ((income - 600000) * 0.1) + (int) ((income - 900000) * 0.15);
        }

        System.out.println("Your tax for year 2024-2025 is: " + tax);
    }
}