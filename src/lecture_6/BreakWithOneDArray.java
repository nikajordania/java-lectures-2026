package lecture_6;

public class BreakWithOneDArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, -30, 40, 50, -60, 70};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("First negative number found: " + numbers[i]);
                break;
            }
        }
    }
}
