package lecture_6;

import java.util.Arrays;

public class Array06_ArraysUtility {
    public static void main(String[] args) {
        int[] data = {42, 7, 19, 3, 88};

        System.out.println("data: " + Arrays.toString(data));

        Arrays.sort(data);
        System.out.println("sorted: " + Arrays.toString(data));

        System.out.println("index of 19: " + Arrays.binarySearch(data, 19));
        System.out.println("index of 50 (not present): " + Arrays.binarySearch(data, 50));

        int[] zeros = new int[5];
        Arrays.fill(zeros, 9);
        System.out.println("filled: " + Arrays.toString(zeros));

        System.out.println("copyOf (size 7): " + Arrays.toString(Arrays.copyOf(data, 7)));
        System.out.println("copyOfRange [1..4): " + Arrays.toString(Arrays.copyOfRange(data, 1, 4)));

        System.out.println("equals: " + Arrays.equals(new int[]{1, 2}, new int[]{1, 2}));

        System.out.println("sum: " + Arrays.stream(data).sum());
        System.out.println("max: " + Arrays.stream(data).max().getAsInt());
    }
}
