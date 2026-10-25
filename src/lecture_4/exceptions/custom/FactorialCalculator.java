package lecture_4.exceptions.custom;

public class FactorialCalculator {

    // throws in the signature: callers must handle InvalidNumberException
    public static long calculate(int number) throws InvalidNumberException {
        if (number < 1 || number > 20) { // 20! is the largest factorial that fits in a long
            throw new InvalidNumberException("Number must be between 1 and 20, got: " + number, number);
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
