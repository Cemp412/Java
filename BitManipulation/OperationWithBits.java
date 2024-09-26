import java.util.*;

public class OperationWithBits {
    //Get Ith bit
    public static int getIthBit(int n, int i) { //If i = 1 it will shift to left by 1 bit, If i=2 It will shift to left by 2
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }

    //Set Ith bit
    public static int SetIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask; //performing OR operation and return New fromed bit.
    }

    //clear Ith Bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    //update Ith Bit
    public static int updateIthBit(int n, int i, int newBit) {
       /*  if(newBit == 0) {
            return clearIthBit(n, i);
        }
        else{
            return SetIthBit(n, i);
        } */

       n = clearIthBit(n, i);
       int bitMask = newBit << i;
       return n | bitMask;

    }

    public static int clearLastIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeInBits(int n, int i, int j) {
        int a = ((~0) << (j +1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }


    public static void main(String args[]) {
        System.out.println(getIthBit(5, 2));
        System.out.println(SetIthBit(10, 2));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastIthBits(10, 2));
        System.out.println(clearRangeInBits(15, 2, 7));
        System.out.println(isPowerOfTwo(10));
    }
}