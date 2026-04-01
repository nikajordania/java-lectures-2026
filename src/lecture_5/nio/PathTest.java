package lecture_5.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("directory", "subdirectory", "file.txt");
        Path path2 = Path.of("directory", "subdirectory", "file.txt");

    }
}
