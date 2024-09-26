import java.util.*;

public class AreaOfSquare {
    public static int AreaOfSquare(int side) {
        int area = 0;
        area = (int) side * side;
        return area;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square :");
        int side = sc.nextInt();
        System.out.println(AreaOfSquare(side));
    }
}