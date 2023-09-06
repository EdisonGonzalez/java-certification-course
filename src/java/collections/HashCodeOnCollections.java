package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashCodeOnCollections {

    public static void main(String[] args) {
        final List<String> stringList = Stream
                .iterate(0, (a)->a+1)
                .map(integer -> (char) integer.intValue())
                .map(Object::toString)
                .limit(1000)
                .collect(Collectors.toList());
        Set<HashObject> equalHashObjectSet = new HashSet<>();
        Set<HashObject> distinctHashObjectSet = new HashSet<>();
        for (final String string : stringList) {
            final HashObject hashObject = new HashObject(string, 1);
            equalHashObjectSet.add(hashObject);
        }
        for (int i = 0; i<stringList.size(); i++) {
            final String string = stringList.get(i);
            final HashObject hashObject = new HashObject(string, i);
            if (string.equals("a")) System.out.println(i);
            distinctHashObjectSet.add(hashObject);
        }
        long start = System.nanoTime();
        System.out.println(equalHashObjectSet.contains(new HashObject("a", 1)));
        System.out.printf("| ElapsedTime=%,3d\n", System.nanoTime()-start);
        start = System.nanoTime();
        System.out.println(distinctHashObjectSet.contains(new HashObject("a", 97)));
        System.out.printf("| ElapsedTime=%,3d\n", System.nanoTime()-start);
    }

    public static class HashObject {
        private String stringAttribute;
        private Integer numberAttribute;

        public HashObject(String string, Integer integer) {
            this.stringAttribute = string;
            this.numberAttribute = integer;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HashObject)) return false;
            HashObject that = (HashObject) o;
            return Objects.equals(stringAttribute, that.stringAttribute) && Objects.equals(numberAttribute, that.numberAttribute);
        }

        @Override
        public int hashCode() {
            return Objects.hash(numberAttribute);
        }

        public String getStringAttribute() {
            return stringAttribute;
        }

        public void setStringAttribute(String stringAttribute) {
            this.stringAttribute = stringAttribute;
        }

        public Integer getNumberAttribute() {
            return numberAttribute;
        }

        public void setNumberAttribute(Integer numberAttribute) {
            this.numberAttribute = numberAttribute;
        }

        @Override
        public String toString() {
            return "HashObject{" +
                    "stringAttribute='" + stringAttribute + '\'' +
                    ", numberAttribute=" + numberAttribute +
                    '}';
        }
    }
}
