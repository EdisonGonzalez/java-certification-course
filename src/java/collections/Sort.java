package collections;

import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> stringList = List.of("d", "aa", "mm", "bb", "zzz", "www", "a");
        Comparator<String> lengthComp = (s1, s2) -> s1.length() - s2.length();
        Comparator<String> alphabetical = String::compareTo;
        stringList.stream().sorted(lengthComp).forEach(System.out::println);
        System.out.println("----");
        stringList.stream().sorted(lengthComp.thenComparing(alphabetical)).forEach(System.out::println);
        System.out.println("----");
        stringList.stream().sorted(alphabetical.thenComparing(lengthComp)).forEach(System.out::println);
    }
}
