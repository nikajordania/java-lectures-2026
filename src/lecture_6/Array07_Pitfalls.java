package lecture_6;

import java.util.Arrays;

public class Array07_Pitfalls {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        int[] empty = null;
        try {
            System.out.println(empty.length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: array was not created");
        }

        try {
            int[] wrong = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException");
        }

        int[] small = {1, 2, 3};
        int[] bigger = Arrays.copyOf(small, small.length + 1);
        bigger[bigger.length - 1] = 4;
        System.out.println("Resized: " + Arrays.toString(bigger));

        int[][] jagged = {{1, 2}, {3}, {4, 5, 6}};
        for (int[] row : jagged) {
            System.out.println("Row length: " + row.length);
        }

        int count = 0;
        for (int n : numbers) {
            count++;
        }
        System.out.println("Iterations: " + count);
    }
}
