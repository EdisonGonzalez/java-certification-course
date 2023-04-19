package stream;

import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        Stream<Integer> stream2 = stream.filter(i -> i<10);
//        stream.forEach(System.out::println);
    }
}
