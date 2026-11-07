package lecture_6;

import java.util.Arrays;

public class Array01_Basics {
    public static void main(String[] args) {
        int[] numbers;

        numbers = new int[5];
        System.out.println("After new int[5]: " + Arrays.toString(numbers));

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[4] = 50;
        System.out.println("After assignments: " + Arrays.toString(numbers));

        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("length = " + numbers.length);

        String[] names = {"Anna", "Giorgi", "Nino"};
        System.out.println("names[2] = " + names[2]);

        boolean[] flags = new boolean[3];
        double[] prices = new double[3];
        String[] words = new String[3];
        System.out.println("flags:  " + Arrays.toString(flags));
        System.out.println("prices: " + Arrays.toString(prices));
        System.out.println("words:  " + Arrays.toString(words));

        int[] a = {1, 2, 3};
        int b[] = {1, 2, 3};
        System.out.println("a.length = " + a.length + ", b.length = " + b.length);
    }
}
