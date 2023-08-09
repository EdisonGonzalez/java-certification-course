package paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathImplementations {
    /**
     * Use java.nio in Java 11 - Static methods for Files and Paths (Not use Buffers)
     * @param args
     */
    public static void main(String... args) {
//        var path = Path.of("/F:A", "B", "C", "Book.java");
        var path = Paths.get("/F:A", "B", "C", "Book.java"); // file type: Path
        System.out.println(path.getFileSystem());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        try {
            Files.readString(path); // TODO: Only get error like NoSuchFileException, FileNotFoundException when file is used -- NOT Path --
        } catch (IOException e) {
            System.out.printf("Get exception: %s", e);
        }
    }
}
