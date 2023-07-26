package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionConstuctors {
    public static void main(String[] args) {
        try {
            Set<String> stringSet = Set.of("A", "E", "I", "I", null, "O", "U");
            Map.of("1", 1, "1", 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Set.of throws illegalArgument exception if entries are repeated");
            System.out.println("Map.of throws illegalArgument exception if keys are repeated");
        }

        try {
            Map.of("1", null);
            List.of(null);
            Set.of(null);
        } catch (NullPointerException e) {
            System.out.println("Every collections of method throws NullPointerException when null argument is passed");
        }

        Set<String> stringSet = new TreeSet<>(List.of("A", "E", "I", "I", "O", "U"));
        System.out.println(stringSet);

        Map<String,Integer> integerMap = new TreeMap<>();
        integerMap.put("1",1);
        integerMap.put("1",2);
        integerMap.put("2",1);
        integerMap.putIfAbsent("2",2);
        System.out.println(integerMap);
    }
}
