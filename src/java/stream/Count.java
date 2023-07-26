package stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
        long i = Stream.of(true, false, true)
                .map(b -> b.toString().toUpperCase()) //this is not executed
                .peek(System.out::println) //this is also not executed
                .count();
        i = List.of(1,2,3,4,5).stream()
                .map(n -> n+1)
                .map(n -> n+1)
                .map(n -> n+1)
                .map(n -> n+1)
                .map(n -> n+1)
                .peek(Count::peek)
                .count();
        System.out.println("flatmap does not get ignored");
        i = List.of(List.of(1,2,3), List.of(4,5,6)).stream()
                .flatMap(l -> Stream.of(l))
                .peek(System.out::println)
                .count();
        System.out.println("limit does not get ignored");
        i = List.of(List.of(1,2,3), List.of(4,5,6)).stream()
                .limit(100)
                .peek(System.out::println)
                .count();
        System.out.println("filter does not get ignored");
        i = List.of(List.of(1,2,3), List.of(4,5,6)).stream()
                .filter(b->true)
                .peek(System.out::println)
                .count();
    }

    public static void peek(int i) {
        System.out.println(i);
    }
}
