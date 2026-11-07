package lecture_6;

public class Array10_BreakContinue {
    public static void main(String[] args) {
        int[] values = {4, 8, -2, 15, -7, 23};

        for (int value : values) {
            if (value < 0) {
                System.out.println("First negative: " + value);
                break;
            }
            System.out.println("Checked: " + value);
        }

        for (int value : values) {
            if (value % 2 == 0) {
                continue;
            }
            System.out.println("Odd: " + value);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        boolean found = false;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println("Found " + target + ": " + found);

        search:
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == 8) {
                    System.out.println("Found 8, stopping both loops");
                    break search;
                }
            }
        }
    }
}
