public class typePromotion {
    public static void main(String args[]) {
        //Rule 1: Java automatically promotes each byte, short, char operand to int when evaluating an expression.
        short a = 5;
        byte b = 24;
        char c = 'c';
        int sum =  a + b + c; //type promotion (it converts all short, byte, char into integer)
        System.out.println("Sum of three variables :" + sum);
        byte byt = (byte) (a + b + c); 
        System.out.println("Type conversion of sum of three variables into bytes :" + byt);

        //Rule 2 : In an expression if any one of operand is long, float or double the whole expression is promoted to long, float or double respectively.
        int x = 10;
        float y = 20.5f;
        long z = 35;
        double dbl = 30;
        double ans = (x + y + z + dbl);
        System.out.println(ans);

        // *****Example*******
        byte be = 5;
        // be = be * 2 ; //It doesn't work it gives error
        be = (byte) (be * 2); //It works
        int $ = 56;

    }
}