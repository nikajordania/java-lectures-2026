package lecture_6;

import java.util.Random;

public class ArrayProcessingExample {
    public static void main(String[] args) {
        int[] intArray;
        double[] doubleArray;
        String[] stringArray;

        double[] tempArray1;
        double tempArray2[];

        int[] numbers = {1, 2, 3, 4, 5};
        int[] number2 = new int[15];

        final double[] temperature = {54.7, 453.9, 657.7, 342.2, 564.9, 769.8};


        double max = temperature[0];
        int indexOfMax = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
                indexOfMax = i;
            }
        }


        System.out.println(indexOfMax);
        System.out.println(max);

//        temperature.length
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("old " + temperature[i]);
            temperature[i] += Math.round(new Random().nextDouble(1.0, 100.0));
            System.out.println("new " + temperature[i]);


        }

        t1("sdadsa", "ASdasds", "ASdads");

        // delete array
        int[] arr = {1, 2, 3, 4, 5};
        arr = new int[100];

    }

    static void t1(String... a) {
        for (String s : a) {
            System.out.println(s);
        }
    }
}
