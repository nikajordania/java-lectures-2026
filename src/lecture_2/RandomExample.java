package lecture_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = random.nextInt(100);
        System.out.println("Random Integer: " + randomNumber);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();

        // round the random double to 2 decimal places

        BigDecimal rounded = BigDecimal.valueOf(randomDouble)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Original: " + randomDouble);
        System.out.println("Rounded: " + rounded);
        System.out.println("Random Double: " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generate a random long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        // Generate a random character between 'a' and 'z' (inclusive)
        char randomChar = (char) (random.nextInt(26) + 'a');
        System.out.println("Random Character: " + randomChar);
    }
}
