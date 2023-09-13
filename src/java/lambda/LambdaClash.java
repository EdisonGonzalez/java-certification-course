package lambda;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaClash {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
//        add(set, s -> s.add(10)); //Line n1
//        add(set, s -> s.add(20)); //Line n2
        add(set, s -> {s.add(10);}); //Line n1 => Matches to method at Line n3
        add(set, s -> {return s.add(20);}); //Line n2 => Matches to method at Line n4

        System.out.println(set.size());
    }

    private static void add(Set<Integer> set, Consumer<Set<Integer>> consumer) { //Line n3
        consumer.accept(set);
    }

    private static void add(Set<Integer> set, Predicate<Set<Integer>> predicate) { //Line n4
        predicate.test(set);
    }
}
