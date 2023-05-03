package paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Path {
    /**
     * Use java.nio in Java 11 - Static methods for Files and Paths (Not use Buffers)
     * @param args
     */
    public static void main(String... args) {
        var file = Paths.get("G:\\Folder\\catalog.txt"); // file type: Path
        System.out.println(file.toAbsolutePath());
        try {
            Files.readString(file); // TODO: Only get error like NoSuchFileException, FileNotFoundException when file is used -- NOT Path --
        } catch (IOException e) {
            System.out.printf("Get exception: %s", e);
        }
    }
}
