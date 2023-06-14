package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class ListOrderOfEntries {

    public static void main(String[] args) {
        final String string1 = "100";
        final String string2 = "200";
        final List<String> arrayList = new ArrayList<>();
        arrayList.add(string1);
        arrayList.add(string2);
        arrayList.add(string1);
        arrayList.add(string2);
        arrayList.remove(string1);
        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

        final List<String> linkedList = new LinkedList<>();
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.remove(string1);
        System.out.println(linkedList);

        final Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(string1);
        arrayDeque.add(string2);
        arrayDeque.add(string1);
        arrayDeque.add(string2);
        arrayDeque.remove(string1);
        System.out.println(arrayDeque);

        Map<String, String> treeMap = new TreeMap<>();
    }
}
