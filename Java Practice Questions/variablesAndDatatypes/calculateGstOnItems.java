import java.util.*;

public class calculateGstOnItems {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the following items : pencil, pen and an eraser ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float TotalCost = pencil + pen + eraser;
        float CalculateGST = (TotalCost * 18) / 100;
        float TotalAmt = CalculateGST + TotalCost;
        System.out.println("Total due amount including GST :" + TotalAmt);
    }
}