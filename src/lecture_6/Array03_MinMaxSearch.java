package lecture_6;

public class Array03_MinMaxSearch {
    public static void main(String[] args) {
        int[] temperatures = {12, -3, 25, 7, 31, 18};

        int sum = 0;
        for (int t : temperatures) {
            sum += t;
        }
        double average = (double) sum / temperatures.length;
        System.out.println("Sum: " + sum + ", average: " + average);

        int max = temperatures[0];
        int min = temperatures[0];
        for (int t : temperatures) {
            if (t > max) {
                max = t;
            }
            if (t < min) {
                min = t;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        int positiveCount = 0;
        for (int t : temperatures) {
            if (t > 0) {
                positiveCount++;
            }
        }
        System.out.println("Positive values: " + positiveCount);
    }
}
