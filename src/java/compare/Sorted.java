package compare;

import java.util.Arrays;

public class Sorted {
    /**
     * Use Comparator Interface. It is a functional interface
     *
     * Implement compare method --> int compare (T o1, T o2) - (BiFunction return int)
     *
     * Note: You can use static methods of comparator interface chec in:
     * link: <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html">...</a>
     * link: <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html">...</a>
     *
     * @param args
     */
    public static void main(String[] args) {
        String [] names = {"Peter", "bonita", "John"};
        Arrays.stream(names)
                .sorted(String::compareToIgnoreCase) // (s1, s2) -> s1.compareToIgnoreCase(s2)
                .forEach(System.out::println);
    }
}
