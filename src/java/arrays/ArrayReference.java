package arrays;

import java.util.Arrays;

public class ArrayReference {

    public static void main(String[] args) {
        StringWrapper dynamicWrapper = new StringWrapper("B");
        StringWrapper[] array = {new StringWrapper("A"), dynamicWrapper
                , new StringWrapper("C"), new StringWrapper("D"), new StringWrapper("E")};
        Arrays.stream(array).forEach(System.out::println);

        array[0] = array[1];
        System.out.println();
        Arrays.stream(array).forEach(System.out::println);

        dynamicWrapper.value = "Z";
        System.out.println();
        Arrays.stream(array).forEach(System.out::println);

        array[1] = new StringWrapper("E");
        System.out.println();
        Arrays.stream(array).forEach(System.out::println);
    }

    public static class StringWrapper {
        public String value;

        public StringWrapper(String value) {
            this.value = value;
        }

        public String toString() {
            return value + " | " + this.hashCode();
        }
    }
}
