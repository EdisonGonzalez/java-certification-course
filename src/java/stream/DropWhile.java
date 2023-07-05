package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhile {

    public static void main(String[] args) {
        String str = Stream.of("a", "an", "and", "alas", "after", "b")
                .dropWhile(s -> s.startsWith("a"))
                .collect(Collectors.joining(", "));
        String unorderedStream = Stream.of("a", "an", "b", "and", "alas", "after")
                .dropWhile(s -> s.startsWith("a"))
                .collect(Collectors.joining(", "));
        System.out.println(str);
        System.out.println(unorderedStream);
    }
}
