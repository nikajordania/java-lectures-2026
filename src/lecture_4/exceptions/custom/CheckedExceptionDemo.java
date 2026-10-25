package lecture_4.exceptions.custom;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        // Fix 2 (try/catch): the method handles the error, main does nothing
        printFactorialSafely(5);    // 5! = 120
        printFactorialSafely(60);   // Cannot calculate 60!: ...

        // Fix 1 (throws): the method passes the error up, main must catch it
        try {
            printFactorialOrThrow(0);
        } catch (InvalidNumberException e) {
            System.out.println("main caught: " + e.getMessage());
        }

        // printFactorialGenerated(-1); // uncomment: the program stops with RuntimeException
    }

    // Fix 1 — "Add exception to method signature": the caller decides
    public static void printFactorialOrThrow(int number) throws InvalidNumberException {
        long result = FactorialCalculator.calculate(number);
        System.out.println(number + "! = " + result);
    }

    // Fix 2 — "Surround with try/catch": the error stays inside this method
    public static void printFactorialSafely(int number) {
        try {
            long result = FactorialCalculator.calculate(number);
            System.out.println(number + "! = " + result);
        } catch (InvalidNumberException e) {
            System.out.println("Cannot calculate " + number + "!: " + e.getMessage());
        }
    }

    // What IntelliJ generates: it compiles, but nothing is handled
    public static void printFactorialGenerated(int number) {
        try {
            long result = FactorialCalculator.calculate(number);
            System.out.println(number + "! = " + result);
        } catch (InvalidNumberException e) {
            throw new RuntimeException(e);
        }
    }
}
