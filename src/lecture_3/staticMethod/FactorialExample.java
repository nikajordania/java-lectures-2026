package lecture_3.staticMethod;

public class FactorialExample {
    public static void main(String[] args) {
        // Static method chained across classes — no object creation needed at any step
        int result = MethodCall.getFactorialOf3();
        System.out.println("3! = " + result); // 6

        // Direct call to static utility method
        System.out.println("5! = " + Factorial.getFactorial(5)); // 120

        // Illegal argument — static method throws exception without any object state
        try {
            Factorial.getFactorial(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
