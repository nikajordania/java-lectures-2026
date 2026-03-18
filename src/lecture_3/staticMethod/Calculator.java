package lecture_3.staticMethod;

public class Calculator {

    // Static method — belongs to the class, not an object
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method — belongs to an object
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // --- Static method ---
        // Called using the class name (no object needed) object not initialized
        int sum = Calculator.add(5, 3);
        System.out.println("Sum (static method): " + sum);

        // --- Instance method ---
        // Must create an object to call
        Calculator calc = new Calculator();
        int product = calc.multiply(5, 3);
        System.out.println("Product (instance method): " + product);

        // You can also call a static method via object (allowed but not recommended)
        int sumAgain = calc.add(10, 2);
        System.out.println("Sum via instance (not recommended): " + sumAgain);
    }
}
