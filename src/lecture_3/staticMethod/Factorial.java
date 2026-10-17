package lecture_3.staticMethod;

// Static utility class — all methods are static, no need to instantiate
public class Factorial {

    public static int getFactorial(int num) {
        if (num < 1) throw new IllegalArgumentException("Number must be >= 1, got: " + num);

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

