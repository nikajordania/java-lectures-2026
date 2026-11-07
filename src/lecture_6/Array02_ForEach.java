package lecture_6;

import java.util.Arrays;

public class Array02_ForEach {
    public static void main(String[] args) {
        int[] scores = {72, 85, 90, 64, 78};

        for (int score : scores) {
            System.out.println(score);
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("Total: " + total);

        for (int score : scores) {
            score = score + 100;
        }
        System.out.println("After changing loop variable: " + Arrays.toString(scores));

        int[] bonus = new int[scores.length];
        int position = 0;
        for (int score : scores) {
            bonus[position] = score + 5;
            position++;
        }
        System.out.println("Bonus scores: " + Arrays.toString(bonus));

        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println("reverse: " + scores[i]);
        }

        int[] reversed = new int[scores.length];
        int reversedPosition = reversed.length - 1;
        for (int score : scores) {
            reversed[reversedPosition] = score;
            reversedPosition--;
        }
        System.out.println("Reversed copy: " + Arrays.toString(reversed));
    }
}
