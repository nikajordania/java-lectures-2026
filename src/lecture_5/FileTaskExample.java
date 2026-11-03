package lecture_5;

import java.io.IOException;
import java.nio.file.*;
import java.util.Random;

public class FileTaskExample {

    public static void main(String[] args) {

        Path inputFile = Paths.get("input.txt");
        Path rootDirectory = Paths.get("root");

        if (Files.exists(inputFile)) {
            try {
                Files.delete(inputFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            String content = "";
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                content += "Random line:" + random.nextInt(1, 100) + "\n"; //or instead of "\n" use System.lineSeparator();
            }

            Files.writeString(inputFile, content);

            Files.createDirectory(rootDirectory);

            int counter = 1;

            for (String line : Files.readAllLines(inputFile)) {

                Path subfolder = Paths.get("root/subfolder" + counter);

                Files.createDirectory(subfolder);

                Path outputFile = Paths.get("root/subfolder" + counter + "/output.txt");

                Files.writeString(outputFile, line);

                counter++;
            }

            System.out.println("Task completed successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
