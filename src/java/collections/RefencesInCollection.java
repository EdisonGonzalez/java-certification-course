package collections;

import java.util.ArrayList;
import java.util.List;

public class RefencesInCollection {

    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");
        System.out.println(list);

        InnerObject innerObject = new InnerObject("Hello");
        List<InnerObject> innerObjects = new ArrayList<>();
        innerObjects.add(innerObject);
        innerObjects.add(new InnerObject("Hello"));
        innerObjects.add(innerObject);
        innerObject.replace("l", "L");
        System.out.println(innerObjects);
    }

    static class InnerObject {
        String value;

        public InnerObject(String value) {
            this.value = value;
        }

        void replace(String oldValue, String newValue) {
            value = value.replace(oldValue, newValue);
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
