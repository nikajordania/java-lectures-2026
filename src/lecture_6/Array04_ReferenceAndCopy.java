package lecture_6;

import java.util.Arrays;

public class Array04_ReferenceAndCopy {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = first;
        second[0] = 100;
        System.out.println("first:  " + Arrays.toString(first));
        System.out.println("second: " + Arrays.toString(second));
        System.out.println("same object? " + (first == second));

        doubleAll(first);
        System.out.println("after doubleAll: " + Arrays.toString(first));

        int[] copy = first.clone();
        copy[0] = -1;
        System.out.println("original: " + Arrays.toString(first));
        System.out.println("copy:     " + Arrays.toString(copy));
        System.out.println("same object? " + (first == copy));

        int[] source = {10, 20, 30, 40, 50};
        int[] target = new int[3];
        System.arraycopy(source, 1, target, 0, 3);
        System.out.println("arraycopy result: " + Arrays.toString(target));

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("a == b: " + (a == b));
        System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b));
    }

    static void doubleAll(int[] data) {
        int position = 0;
        for (int value : data) {
            data[position] = value * 2;
            position++;
        }
    }
}
