package lecture_6;

import java.util.Arrays;

public class Array05_MultiDimensional {
    public static void main(String[] args) {
        int[][] grid = new int[3][4];
        System.out.println("rows = " + grid.length + ", columns in row 0 = " + grid[0].length);

        int rowNumber = 0;
        for (int[] row : grid) {
            Arrays.fill(row, rowNumber);
            rowNumber += 10;
        }

        System.out.println("Grid:");
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }

        int[][] table = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int total = 0;
        for (int[] row : table) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Total of table = " + total);

        int[][] triangle = {
                {1},
                {1, 1},
                {1, 0, 1},
                {1, 0, 0, 1}
        };
        System.out.println("Jagged triangle:");
        for (int[] row : triangle) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(Arrays.deepToString(table));
    }
}
