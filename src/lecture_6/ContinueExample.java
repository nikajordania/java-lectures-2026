package lecture_6;

public class ContinueExample {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    continue;
                }
                System.out.println("Odd number found: " + anInt);
            }
        }
    }
}
