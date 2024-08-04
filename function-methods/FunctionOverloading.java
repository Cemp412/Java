public class FunctionOverloading {
    
    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        FunctionOverloading fo = new FunctionOverloading(); // Create an instance
        
        // Calling the instance methods via the created instance
        System.out.println("Sum (int): " + fo.sum(3, 5));         // Calls int sum(int a, int b)
        System.out.println("Sum (float): " + fo.sum(3.5f, 4.0f)); // Calls float sum(float a, float b)
    }
}
