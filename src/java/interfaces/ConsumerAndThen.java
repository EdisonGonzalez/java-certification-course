package interfaces;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println("consumer1: " + i);
        Consumer<Integer> consumer2 = i -> System.out.println("consumer2: " + i);
        Integer i = 5;
        consumer.andThen(consumer2).andThen(consumer2).andThen(consumer).accept(i++); //Line n1
    }
}
