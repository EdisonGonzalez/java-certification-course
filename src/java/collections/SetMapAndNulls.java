package collections;

import java.util.*;

public class SetMapAndNulls {
    public static void main(String[] args) {
        // ------------------------------------ SETs -----------------------------------------
        /**
         * No problem with null values - Only value null
         */
        Set<String> setAndNulls1 = new HashSet<>(Arrays.asList(null, null, null));
        long count1 = setAndNulls1.stream().count();
        System.out.println(count1);
        Set<String> setAndNulls2 = new LinkedHashSet<>(Arrays.asList(null, null, null));
        long count2 = setAndNulls2.stream().count();
        System.out.println(count2);

        /**
         * NPE occurs due to compare method in TreeSet for sort
         */
        try {
            Set<String> setAndNulls = new TreeSet<>(Arrays.asList(null, null, null));
            long count = setAndNulls.stream().count();
            System.out.println(count);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }

        // ------------------------------------ Maps -----------------------------------------
        /**
         * No problem with null values - Only one key null
         */
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        System.out.printf("Print map1: %s %n", map);
        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put(null, null);
        System.out.printf("Print map2: %s %n", map2);


        /**
         * NPE occurs due to compare method in TreeSet for sort
         */
        try {
            Map<String, String> map3 = new TreeMap<>();
            map3.put(null, null);
            System.out.printf("Print map3: %s %n", map3);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
        // Problem in key not in null
        Map<String, String> map4 = new TreeMap<>();
        map4.put("key", null);
        System.out.printf("Print map4: %s %n", map4);
    }
}
