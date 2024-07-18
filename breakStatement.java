import java.util.*;

public class breakStatement {
    public static void main(String args[]) {
        // to execute the break statement
        for(int i = 0; i < 10; i++) {
            if(i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}