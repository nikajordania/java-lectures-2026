package lecture_6;


public class TestArray {

    public static void main(String[] args) {
        double[] temperature = new double[6];
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = Math.random() * 100;
        }


        double max = temperature[0];
        double min = temperature[0];
        for (double v : temperature) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }

        System.out.println(max);
        System.out.println(min);

//        double temp = temperature[0];
//        for (int i = 0; i < temperature.length; i++) {
//            temperature[i - 1] = temperature[i];
//        }

        double[] temperature2 = temperature;

//        printArray(temperature2);

        int[] list1 = {1, 2, 3, 4, 5, 6};
        printArray(list1);
        int[] list2 = reverse(list1);
        printArray(list2);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}