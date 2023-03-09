package optional;

import java.util.List;
import java.util.Optional;

/**
 * Use OR in Optional is for apply Supplier function if value of optional is empty
 */
public class UseOrInOptional {
    public static void main(String[] args) {
        var names = List.of("John", "william", "Claire", "HOPE", "Clark", "Hunter", "Kirk");

        search(names, "jack")
                .or(() -> search(names, "Jon"))
                .or(() -> search(names, "hope"))
                .or(() -> search(names, "Clark"))
                .stream()
                .forEach(System.out::print); // Note for each does not require stream
    }

    static Optional<String> search(List<String> list, String textToSearch) {
        return list.stream()
                .filter(textToSearch::equalsIgnoreCase)
                .findFirst();
    }
}

