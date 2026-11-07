package lecture_6;

import java.util.Arrays;

public class Array09_Operations {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        System.out.println("start:        " + Arrays.toString(numbers));

        numbers = append(numbers, 40);
        System.out.println("append 40:    " + Arrays.toString(numbers));

        numbers = insert(numbers, 1, 15);
        System.out.println("insert 15@1:  " + Arrays.toString(numbers));

        numbers = removeAt(numbers, 0);
        System.out.println("remove @0:    " + Arrays.toString(numbers));

        numbers = replaceAt(numbers, 2, 33);
        System.out.println("replace @2:   " + Arrays.toString(numbers));

        int[] withDuplicates = {5, 1, 5, 2, 5};
        withDuplicates = replaceAll(withDuplicates, 5, 0);
        System.out.println("replace all 5->0: " + Arrays.toString(withDuplicates));

        System.out.println("position of 33: " + indexOf(numbers, 33));
        System.out.println("position of 99: " + indexOf(numbers, 99));
        System.out.println("contains 20?    " + contains(numbers, 20));

        numbers = null;
        System.out.println("after full delete: " + numbers);
        try {
            System.out.println(numbers.length);
        } catch (NullPointerException e) {
            System.out.println("array is gone, access fails");
        }
    }

    static int[] append(int[] array, int value) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[array.length] = value;
        return result;
    }

    static int[] insert(int[] array, int position, int value) {
        int[] result = new int[array.length + 1];
        System.arraycopy(array, 0, result, 0, position);
        result[position] = value;
        System.arraycopy(array, position, result, position + 1, array.length - position);
        return result;
    }

    static int[] removeAt(int[] array, int position) {
        int[] result = new int[array.length - 1];
        System.arraycopy(array, 0, result, 0, position);
        System.arraycopy(array, position + 1, result, position, array.length - position - 1);
        return result;
    }

    static int[] replaceAt(int[] array, int position, int value) {
        int[] result = array.clone();
        result[position] = value;
        return result;
    }

    static int[] replaceAll(int[] array, int oldValue, int newValue) {
        int[] result = new int[array.length];
        int position = 0;
        for (int value : array) {
            result[position] = (value == oldValue) ? newValue : value;
            position++;
        }
        return result;
    }

    static int indexOf(int[] array, int value) {
        int position = 0;
        for (int current : array) {
            if (current == value) {
                return position;
            }
            position++;
        }
        return -1;
    }

    static boolean contains(int[] array, int value) {
        return indexOf(array, value) != -1;
    }
}
