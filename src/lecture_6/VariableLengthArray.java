package lecture_6;

public class VariableLengthArray {
    public static void main(String[] args) {
        int[][] variableLengthArray = new int[3][];

        variableLengthArray[0] = new int[3];
        variableLengthArray[1] = new int[4];
        variableLengthArray[2] = new int[2];

        variableLengthArray[0][0] = 1;
        variableLengthArray[1][1] = 2;
        variableLengthArray[2][0] = 3;

        System.out.println("Iterating through the variable length array:");
        for (int i = 0; i < variableLengthArray.length; i++) {
            for (int j = 0; j < variableLengthArray[i].length; j++) {
                System.out.print(variableLengthArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
