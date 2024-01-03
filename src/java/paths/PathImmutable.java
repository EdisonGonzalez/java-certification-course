package paths;

import java.nio.file.Paths;

public class PathImmutable {
    public static void main(String[] args) {
        var path = Paths.get("F:\\A\\.\\B\\C\\D\\..\\Book.java"); // 'Path["F:\\A\\.\\B\\C\\D\\..\\Book.java"]' --------> absolute path
        path.normalize(); // return was ignored
        System.out.println(path);
        path = path.normalize(); // 'Path["F:\\A\\B\\C\\"]'
        System.out.println(path);
    }
}
