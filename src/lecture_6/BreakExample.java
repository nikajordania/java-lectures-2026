package lecture_6;

import static java.lang.Thread.sleep;

public class BreakExample {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = {
                {1, 2, 3, 1},
                {4, 5, 6},
                {7, 9, 6},
        };

        int target = 5;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            sleep(1000); // Simulate some processing time
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
                if (matrix[i][j] == target) {
                    System.out.println("Found target " + target + " at (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println("ASdasf,");
    }
}
