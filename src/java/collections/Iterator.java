package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

    public static void main(String[] args) {
        //                               0   1    2    3    4    5
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(5);
        while(iter.hasPrevious()) {
            System.out.print(iter.previous());
        }
    }
}
