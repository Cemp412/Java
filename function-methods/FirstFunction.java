public class FirstFunction {

    public static int printHelloWorld() { // function has type int
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return 4; //It is important to return value as type int otherwise it gives error
    }

    public static void main(String args[]) {
        printHelloWorld();
    }
}