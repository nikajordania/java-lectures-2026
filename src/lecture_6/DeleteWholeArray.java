package lecture_6;

import java.util.Arrays;

public class DeleteWholeArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Before delete: " + Arrays.toString(numbers));

        // Delete the whole array
        numbers = null;

        // Now the array is deleted (reference lost)
        System.out.println("After delete: " + numbers); // prints: null

        numbers = new int[]{60, 70, 80};
        System.out.println("New array: " + Arrays.toString(numbers));
    }
}
