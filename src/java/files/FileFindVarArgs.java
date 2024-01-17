package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class FileFindVarArgs {
  public static void main(String[] args) throws IOException {
    var root = Paths.get("F:");
    BiPredicate<Path, BasicFileAttributes> predicate = (p, a) -> p.endsWith("txt");
    try (var paths = Files.find(root, 2, predicate)) { // Options is the four argument, because it´s varargs is optional
        checkVarArgsOne(args[0]);
        checkVarArgsOne(args[0], args[1]);
        checkVarArgsOne(args[0], args);
      paths.forEach(System.out::println);
    }
  }

  // Check another examples
  public static void checkVarArgsOne(String var, String... args) {
  }

  /*
  Varargs only use it like the last one arg in method, and it can be optional
   */
  public static void checkVarArgsOne(String var) { //String... args, Integer... var2) {
  }
}
