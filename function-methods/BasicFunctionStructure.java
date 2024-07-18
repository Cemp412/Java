
/** declare a class first (class name will be same as file name) */
public class BasicFunctionStructure {

    public static void printHelloWorld() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
        return; //function must have return type (you can skip return statement for return-type void only.)
    }

    public static void main(String args[]) { // main is pre-defined keyword in java
        printHelloWorld();
    }
}