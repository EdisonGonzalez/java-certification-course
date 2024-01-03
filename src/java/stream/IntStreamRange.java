package stream;

import java.util.stream.IntStream;

public class IntStreamRange {
    public static void main(String[] args) {
        /*
         https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html#range(int,int)
         * static IntStream range(int startInclusive, int endExclusive)
            Returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive)
            by an incremental step of 1.

         * API Note: An equivalent sequence of increasing values can be produced sequentially using a for loop as follows:

           for (int i = startInclusive; i < endExclusive ; i++) { ... }

         * Parameters:
            startInclusive - the (inclusive) initial value
            endExclusive - the exclusive upper bound
         * Returns:
            a sequential IntStream for the range of int elements
         */
        long count = IntStream.range(10, 1).count();
        System.out.println(count);
        assert(count == 0);
    }
}
