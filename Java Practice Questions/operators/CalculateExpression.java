public class CalculateExpression {
    public static void main(String args[]) {
        int x=2, y=5, z=100; 
        int exp1 = (x * y /x);
        int exp2 = ( x * (y/x));
        System.out.println("exp1 :" + exp1);
        System.out.println("exp2 :" + exp2);

        x=200; y=50; ;
        if(x > y && y > z) {
            System.out.println("Hello");
        }

        if(z > y && z < x){
         System.out.println("Java");
        }

        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}
