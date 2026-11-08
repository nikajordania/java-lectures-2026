package lecture_6;

import java.util.Arrays;

public class Array08_MethodParameters {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

        printArray(numbers);
        System.out.println("sum = " + sumArray(numbers));

        fillWithValue(numbers, 7);
        System.out.println("after fillWithValue: " + Arrays.toString(numbers));

        replaceReference(numbers);
        System.out.println("after replaceReference: " + Arrays.toString(numbers));

        int[] withNegatives = {3, -1, 4, -5, 9};
        System.out.println("without negatives: " + Arrays.toString(withoutNegatives(withNegatives)));

        System.out.println(joinWords());
        System.out.println(joinWords("Java"));
        System.out.println(joinWords("Java", "arrays", "are", "objects"));

        String[] words = {"varargs", "is", "an", "array"};
        System.out.println(joinWords(words));

        System.out.println("sum of varargs = " + sumAll(1, 2, 3, 4));
    }

    static void printArray(int[] array) {
        System.out.println("array: " + Arrays.toString(array));
    }

    static int sumArray(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    static void fillWithValue(int[] array, int value) {
        Arrays.fill(array, value);
    }

    static void replaceReference(int[] array) {
        array = new int[]{100, 200};
        System.out.println("inside replaceReference: " + Arrays.toString(array));
    }

    static int[] withoutNegatives(int[] source) {
        int count = 0;
        for (int value : source) {
            if (value >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int position = 0;
        for (int value : source) {
            if (value >= 0) {
                result[position] = value;
                position++;
            }
        }
        return result;
    }

    static String joinWords(String... words) {
        System.out.print("(" + words.length + " words) ");
        return String.join(" ", words);
    }

    static int sumAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
}
