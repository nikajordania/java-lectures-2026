package lecture_3.staticMethod;

public class MethodCall {

    // Static method calling another static method — no objects needed anywhere
    public static int getFactorialOf3() {
        System.out.println("Getting factorial of 3...");
        return Factorial.getFactorial(3);
    }
}
